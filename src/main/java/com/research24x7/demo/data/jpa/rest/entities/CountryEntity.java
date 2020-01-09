

package com.research24x7.demo.data.jpa.rest.entities;



import java.util.Date;


import javax.persistence.*; 
import javax.validation.constraints.Size;



@Table (name="country")
@Entity (name="Country")
public class CountryEntity { 
	
	
	
	@Id  
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Basic (optional=false)  
    @Column (name="cou_id", nullable=false, insertable=false)
    private Integer id = null;
	
	
	@Size (max = 10) 
	@Column (name="cou_code", nullable=false, length = 10)
	private String  code = null;
	
	
	@Size (max = 100) 
	@Column (name="cou_name", nullable=false, length = 100)
	private String   name = null;
	

	@Column (name="sys_creation", nullable=false)
	private Date createdAt = new Date ();

	
	@Column (name="sys_update", nullable=true)
	private Date updatedAt = null;
	    
	
	@Column (name="sys_enabled", nullable=false)
	private Integer enabled = 0;
	
	
	
	public CountryEntity () {
		
		
		super ();
	}
	
	
	public CountryEntity (Integer id, String code, String name,
			              Date createdAt, Date updatedAt, Integer enabled) {
		
		
		super ();
		

		this.id   = id;
		this.code = code;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.enabled   = enabled;
	}

	
	
	public Integer getId () {

	
		return this.id;
	}
	
	public void setId (Integer id) {
		
		
		this.id = id;
	}
	

	public String getCode () {
		
		
		return this.code;
	}
	
	
	public void setCode (String code) {
		
		
		this.code = code;
	}
	
	
	public String getName () {
		
		
		return this.name;
	}
	

	public void setName (String name) {
		
		
		this.name = name;
	}
	
	
	public Date getCreatedAt () {
		
		
		return this.createdAt;
	}
	

	
	public void setCreatedAt (Date createdAt) {
		
		
		this.createdAt = createdAt;
	}
	

	
	public Date getUpdatedAt () {
		
	
		return this.updatedAt;
	}
	

	
	public void setUpdatedAt (Date updatedAt) {
		
	
		this.updatedAt = updatedAt;
	}
	

	
	public Integer getEnabled () {
		
		
		return this.enabled;
	}
	

	
	public void setEnabled (Integer enabled) {
		
	
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
              
        // Check the classes.
        CountryEntity other = (CountryEntity) object;  
        if (this.getId () != other.getId () && (this.getId () == null || !this.id.equals (other.getId ()))) {  
            return false;  
        }  
        
        
        return true; 
	}
}