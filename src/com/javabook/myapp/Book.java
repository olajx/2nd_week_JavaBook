package com.javabook.myapp;

public class Book {
	private String title;
	private int pages;
	private String topic;

	public Book (){

	}

	public void setTitle(String myTitle){
		title = myTitle;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setPages(int myPages){
		 pages = myPages;
	}
	
	public int getPages(){
		return pages;
	}
	
	public void setTopic(String myTopic){
		 topic = myTopic;
	}
	
	public String getTopic(){
		
		 return topic;
	}
	
	public void showBook(){
		
		 System.out.println("My book is " + getTitle() + ", " + getPages() + " pages, category is " + getTopic() );
	}
}


