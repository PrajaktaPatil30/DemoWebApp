package com.DemoWebApp.BookExchange.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int UserId;
	@Column
	private String Password, Organization, City;
	@Id
	private String userName;
	@Column
	private long ContactNum;
	
	public int getUserID()
	{
		return this.UserId;
	}
	
	public void setUserId(int UserId)
	{
		this.UserId=UserId;		
	}
	
	public String getPassword()
	{
		return this.Password;
	}
	
	public void setPassword(String Password)
	{
		this.Password=Password;		
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName=userName;		
	}
	
	public String getOrganization()
	{
		return this.Organization;
	}
	
	public void setOrganization(String Organization)
	{
		this.Organization=Organization;		
	}
	
	public String getCity()
	{
		return this.City;
	}
	
	public void setCity(String City)
	{
		this.City=City;		
	}
	
	public long getContactNum()
	{
		return this.ContactNum;
	}
	
	public void setContactNum(long ContactNum)
	{
		this.ContactNum=ContactNum;		
	}

	

}
