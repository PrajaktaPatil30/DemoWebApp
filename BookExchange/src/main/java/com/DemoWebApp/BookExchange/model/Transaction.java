package com.DemoWebApp.BookExchange.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int TransactionId;
	@Column
	private int UserId;
	@Column
	private int BookId;
	@Column
	private String Type;
	
	public int getTransactionId()
	{
		return this.TransactionId;
	}
	
	public void setTransactionId(int TransactionId)
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
		
	public int getUserID()
	{
		return this.UserId;
	}
	
	public void setUserId(int UserId)
	{
		this.UserId=UserId;		
	}
	
	public int getBookId()
	{
		return this.BookId;
	}
	
	public void setBookId(int BookId)
	{
		this.BookId=BookId;		
	}
	
}
