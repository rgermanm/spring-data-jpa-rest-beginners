

package com.research24x7.demo.data.jpa.rest.excerpt;



import com.research24x7.demo.data.jpa.rest.entities.ProvinceEntity;
import com.research24x7.demo.data.jpa.rest.entities.CountryEntity;
import org.springframework.data.rest.core.config.Projection;


@Projection (name="ProvinceExcerpt", types = ProvinceEntity.class)
public interface ProvinceExcerpt { 
	
	
	
	Integer getId ();
	
	String getName ();
	
	
	CountryEntity getCountry ();
}