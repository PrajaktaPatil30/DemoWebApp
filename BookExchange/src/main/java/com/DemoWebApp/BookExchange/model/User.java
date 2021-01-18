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
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int UserId;
	@Column
	private String Password, UserName, Organization, City;
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
		return this.UserName;
	}
	
	public void setUserName(String UserName)
	{
		this.UserName=UserName;		
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
