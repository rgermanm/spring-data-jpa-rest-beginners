

package com.research24x7.demo.data.jpa.rest.entities;



import java.util.Date;


import javax.persistence.*; 
import javax.validation.constraints.Size;


import org.springframework.data.rest.core.annotation.RestResource;


@Table (name="province")
@Entity (name="Province")
public class ProvinceEntity { 
	
	
	
	@Id  
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Basic (optional=false)  
    @Column (name="pro_id", nullable=false, insertable=false)
    private Integer id = null;
	
	
	@ManyToOne (optional=false)
	@JoinColumn (name="cou_id", referencedColumnName="cou_id")
	@RestResource (path = "country", rel="country")
	private CountryEntity country = null;
	
	
	@Size (max = 100) 
	@Column (name="pro_name", nullable=false, length = 100)
	private String name = null;
	
	
	@Column (name="sys_creation", nullable=false)
	private Date createdAt = new Date ();

	
	@Column (name="sys_update", nullable=true)
	private Date updatedAt = new Date ();
	    
	
	@Column (name="sys_enabled", nullable=false)
	private Integer enabled = 0;
	

	public ProvinceEntity () {
		
	
		super ();
	}
	
	
	public ProvinceEntity (Integer id, CountryEntity country, String name,
			              Date createdAt, Date updatedAt, Integer enabled) {
		
	
		super ();
		

		this.id   = id;
		this.country = country;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.enabled   = enabled;
	}

	
	
	public Integer getId () {

		// Return the value.
		return this.id;
	}
	
	
	public void setId (Integer id) {
		
		// Set the value.
		this.id = id;
	}
	
	
	public CountryEntity getCountry () {
		
		// Return the value.
		return this.country;
	}
	
	
	public void setCountry (CountryEntity country) {
		
		// Set the value.
		this.country = country;
	}
	

	public String getName () {
		
		// Return the value.
		return this.name;
	}
	
	
	public void setName (String name) {
		
		// Set the value.
		this.name = name;
	}
	
	
	public Date getCreatedAt () {
		
		// Return the value.
		return this.createdAt;
	}
	

	public void setCreatedAt (Date createdAt) {
		
		// Set the value.
		this.createdAt = createdAt;
	}
	

	
	public Date getUpdatedAt () {
		
		// Return the value.
		return this.updatedAt;
	}
	

	
	public void setUpdatedAt (Date updatedAt) {
		
		// Set the value.
		this.updatedAt = updatedAt;
	}
	

	
	public Integer getEnabled () {
		
		// Return the value
		return this.enabled;
	}
	

	public void setEnabled (Integer enabled) {
		
		// Set the value.
		this.enabled = enabled;
	}
	
	
	
	@Override
	public int hashCode () {
		
	
		int hash = 0;  
        hash += (this.getId () != null ? this.getId ().hashCode () : 0);  
  

        return hash;
	}

	
	@Override
	public boolean equals (Object object) {
		
	
		if (this == object)  {
			return true;
		}
              
        if (object == null) {
        	return false;
        }  
              
        if (getClass () != object.getClass ()) {
        	return false;
        }  
              
      
        ProvinceEntity other = (ProvinceEntity) object;  
        if (this.getId () != other.getId () && (this.getId () == null || !this.id.equals (other.getId ()))) {  
            return false;  
        }  
        
        return true; 
	}
}