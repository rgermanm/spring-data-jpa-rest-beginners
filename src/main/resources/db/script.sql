-- Sequence: country_seq

-- DROP SEQUENCE country_seq;

CREATE SEQUENCE country_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 3
  CACHE 1
  CYCLE;


-- Table: country

-- DROP TABLE country;

CREATE TABLE country
(
  cou_id integer NOT NULL DEFAULT nextval('country_seq'::regclass),
  cou_name character varying(100) NOT NULL,
  cou_code character varying(10) NOT NULL,
  sys_creation timestamp with time zone NOT NULL DEFAULT now(),
  sys_update timestamp with time zone,
  sys_enabled integer NOT NULL DEFAULT 0,
  CONSTRAINT pk_country PRIMARY KEY (cou_id)
)
WITH (
  OIDS=FALSE
);



-- Sequence: province_seq

-- DROP SEQUENCE province_seq;

CREATE SEQUENCE province_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 6
  CACHE 1
  CYCLE;
  
  
  -- Table: province

-- DROP TABLE province;

CREATE TABLE province
(
  pro_id integer NOT NULL DEFAULT nextval('province_seq'::regclass),
  pro_name character varying(100) NOT NULL,
  cou_id integer NOT NULL,
  sys_creation timestamp with time zone NOT NULL DEFAULT now(),
  sys_update timestamp with time zone,
  sys_enabled integer NOT NULL DEFAULT 0,
  CONSTRAINT pk_province PRIMARY KEY (pro_id),
  CONSTRAINT fk_province_country FOREIGN KEY (cou_id)
      REFERENCES country (cou_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fkhbf1iw8ebkxs4a0c4pnci981k FOREIGN KEY (cou_id)
      REFERENCES country (cou_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);




-- Sequence: city_seq

-- DROP SEQUENCE city_seq;

CREATE SEQUENCE city_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1
  CYCLE;
  
  
  
  -- Table: city

-- DROP TABLE city;

CREATE TABLE city
(
  cit_id integer NOT NULL DEFAULT nextval('city_seq'::regclass),
  cit_name character varying(100) NOT NULL,
  pro_id integer NOT NULL,
  sys_creation timestamp with time zone NOT NULL DEFAULT now(),
  sys_update timestamp with time zone,
  sys_enabled integer NOT NULL DEFAULT 0,
  CONSTRAINT pk_city PRIMARY KEY (cit_id),
  CONSTRAINT fk_city_province FOREIGN KEY (pro_id)
      REFERENCES province (pro_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fks2huc2muv1wpvkrmw4vmp63xn FOREIGN KEY (pro_id)
      REFERENCES province (pro_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);