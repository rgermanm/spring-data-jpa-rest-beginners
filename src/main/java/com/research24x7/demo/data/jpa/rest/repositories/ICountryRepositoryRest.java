

package com.research24x7.demo.data.jpa.rest.repositories;



import com.research24x7.demo.data.jpa.rest.excerpt.CountryExcerpt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.research24x7.demo.data.jpa.rest.entities.CountryEntity;


@RepositoryRestResource (itemResourceRel="country", collectionResourceRel = "country", path = "country", 
                         excerptProjection = CountryExcerpt.class)
public interface ICountryRepositoryRest extends CrudRepository<CountryEntity, Integer> {

	

}