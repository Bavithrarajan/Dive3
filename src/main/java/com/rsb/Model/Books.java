package com.rsb.Model;

public class Books {
private int id;
private String bookName;
private String author;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Books [id=" + id + ", bookName=" + bookName + ", author=" + author + "]";
}
public void init()
{
	System.out.println("init method is running");
}
public void destroy()
{
	System.out.println("destroy method is running");
}

}

