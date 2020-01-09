

package com.research24x7.demo.data.jpa.rest.excerpt;



import org.springframework.data.rest.core.config.Projection;

import com.research24x7.demo.data.jpa.rest.entities.CountryEntity;




@Projection (name="CountryExcerpt", types = CountryEntity.class)
public interface CountryExcerpt { 
	
	
	
	Integer getId ();
	
	
	String getCode ();
	
	
	String getName ();
}