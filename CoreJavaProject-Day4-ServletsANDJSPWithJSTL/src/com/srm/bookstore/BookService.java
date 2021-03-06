package com.srm.bookstore;

import java.sql.SQLException;
import java.util.List;

public class BookService {
	
	private BookDAO bookDAO;
	
	
	 public List<Book> getListOfBook(){
	   List<Book> listofBooks = null;
	   try {
		   bookDAO = new BookDAO();
		   listofBooks= bookDAO.getListOfBook();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listofBooks;
	}
	 
	 public Book getBook(int id){
		 Book book = null; 
		 
		 try {
			 bookDAO = new BookDAO();
			 book = bookDAO.getBook(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return book;	  
	 }
	 
	 
	 public boolean insertBook(Book book){
		boolean status = false;
		 
		try {
			bookDAO = new BookDAO();
			status = bookDAO.insertBook(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	 }
	 
	 public boolean updateBook(Book book){
		 boolean status = false;
		 try {
			 bookDAO = new BookDAO();
			bookDAO.updateBook(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return status;
	 }
	
	 public boolean deleteBook(Book book){
		 boolean status = false;
		 try {
			 bookDAO = new BookDAO();
			bookDAO.deleteBook(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return status;
		 
	 }
	
	

}
