package com.DemoWebApp.model;

public class Book {
	private String BookId, BookName, Author;
	private int NumOfCopies, Price;
	
	public String getBookId()
	{
		return this.BookId;
	}
	
	public void setBookId(String BookId)
	{
		this.BookId=BookId;		
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
	
	public int getPrice()
	{
		return this.Price;
	}
	
	public void setPrice(int Price)
	{
		this.Price=Price;		
	}

}
