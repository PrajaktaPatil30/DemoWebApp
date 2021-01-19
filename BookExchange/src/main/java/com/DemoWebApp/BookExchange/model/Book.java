package com.DemoWebApp.BookExchange.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int BookId;
	@Column
	private String BookName, Author;
	@Column
	private int NumOfCopies;
	@Column
	private double Price;
	
	public int getBookId()
	{
		return this.BookId;
	}
	
	public void setBookId(int BookId)
	{
		this.BookId= BookId;		
	}
	
	public String getBookName()
	{
		return this.BookName;
	}
	
	public void setBookName(String BookName)
	{
		this.BookName=BookName;		
	}
	
	public String getAuthor()
	{
		return this.Author;
	}
	
	public void setAuthor(String Author)
	{
		this.Author=Author;		
	}
	
	public int getNumOfCopies()
	{
		return this.NumOfCopies;
	}
	
	public void setNumOfCopies(int NumOfCopies)
	{
		this.NumOfCopies=NumOfCopies;		
	}
	
	public double getPrice()
	{
		return this.Price;
	}
	
	public void setPrice(double Price)
	{
		this.Price=Price;		
	}

}
