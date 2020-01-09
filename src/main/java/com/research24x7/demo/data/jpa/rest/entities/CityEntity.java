

package com.research24x7.demo.data.jpa.rest.entities;



import java.util.Date;


import javax.persistence.*; 
import javax.validation.constraints.Size;



@Table (name="city")
@Entity (name="City")
public class CityEntity { 
	
	
	
	@Id  
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Basic (optional=false)  
    @Column (name="cit_id", nullable=false, insertable=false)
    private Integer id = null;
	

	@ManyToOne (optional=false)
	@JoinColumn (name="pro_id", referencedColumnName="pro_id")
	private ProvinceEntity province = null;
	
	
	@Size (max = 100) 
	@Column (name="cit_name", nullable=false, length = 100)
	private String name = null;
	
	
	@Column (name="sys_creation", nullable=false)
	private Date createdAt = null;  

	
	@Column (name="sys_update", nullable=true)
	private Date updatedAt = null;
	    
	
	@Column (name="sys_enabled", nullable=false)
	private Integer enabled = 0;
	
	
	
	public CityEntity () {
		
	
		super ();
	}
	
	
	public CityEntity (Integer id, ProvinceEntity province, String name,
			           Date createdAt, Date updatedAt, Integer enabled) {
		
		
		super ();
		

		this.id       = id;
		this.province = province;
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
	
	public ProvinceEntity getProvince () {
		
	
		return this.province;
	}
	
	
	public void setCountry (ProvinceEntity province) {
		
	
		this.province = province;
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
		
		// Return the value.
		return this.updatedAt;
	}
	

	
	public void setUpdatedAt (Date updatedAt) {
		
		
		this.updatedAt = updatedAt;
	}
	

	public Integer getEnabled () {
		
		// Return the value
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
              
     
        CityEntity other = (CityEntity) object;  
        if (this.getId () != other.getId () && (this.getId () == null || !this.id.equals (other.getId ()))) {  
            return false;  
        }  
        

        return true; 
	}
}