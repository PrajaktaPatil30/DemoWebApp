package com.DemoWebApp.model;

public class Transaction {
	
	private String TransactionId, Type, UserId, BookId;
	
	public String getTransactionId()
	{
		return this.TransactionId;
	}
	
	public void setTransactionId(String TransactionId)
	{
		this.TransactionId= TransactionId;		
	}
	
	public String getType()
	{
		return this.Type;
	}
	
	public void setType(String Type)
	{
		this.Type=Type;		
	}
		
	public String getUserID()
	{
		return this.UserId;
	}
	
	public void setUserId(String UserId)
	{
		this.UserId=UserId;		
	}
	
	public String getBookId()
	{
		return this.BookId;
	}
	
	public void setBookId(String BookId)
	{
		this.BookId=BookId;		
	}
	
}
