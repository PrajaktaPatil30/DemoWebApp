package com.DemoWebApp.model;

public class User {
	
	private String UserId, Password, UserName, Organization, City;
	private int ContactNum;
	
	public String getUserID()
	{
		return this.UserId;
	}
	
	public void setUserId(String UserId)
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
	
	public int getContactNum()
	{
		return this.ContactNum;
	}
	
	public void setPrice(int ContactNum)
	{
		this.ContactNum=ContactNum;		
	}


}
