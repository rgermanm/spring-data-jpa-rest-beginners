

package com.research24x7.demo.data.jpa.rest.excerpt;



import com.research24x7.demo.data.jpa.rest.entities.CityEntity;
import com.research24x7.demo.data.jpa.rest.entities.ProvinceEntity;
import org.springframework.data.rest.core.config.Projection;


@Projection (name="CityExcerpt", types = CityEntity.class)
public interface CityExcerpt { 
	
	
	Integer getId ();
	
	
	String getName ();
	
	
	ProvinceEntity getProvince ();
}