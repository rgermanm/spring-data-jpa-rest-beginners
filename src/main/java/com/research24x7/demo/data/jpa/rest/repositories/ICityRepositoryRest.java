

package com.research24x7.demo.data.jpa.rest.repositories;



import com.research24x7.demo.data.jpa.rest.entities.CityEntity;
import com.research24x7.demo.data.jpa.rest.excerpt.CityExcerpt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource (itemResourceRel="city", collectionResourceRel = "city", path = "city",
                         excerptProjection = CityExcerpt.class)
public interface ICityRepositoryRest extends CrudRepository<CityEntity, Integer> {

	

}