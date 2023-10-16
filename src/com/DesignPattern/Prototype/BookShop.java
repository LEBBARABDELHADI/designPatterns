package com.DesignPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	String shopName;
	List<Book> listBooks = new ArrayList<Book>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getListBooks() {
		return listBooks;
	}
	public void setListBooks(List<Book> listBooks) {
		this.listBooks = listBooks;
	}

	public void loadBooks() {
		for (int i = 0; i<10; i++) {
			Book book =new Book();
			book.setPrice(i);
			book.setBookName("book "+i);
			this.getListBooks().add(book);
		}
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", listBooks=" + listBooks + "]";
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bookShopClonned =new BookShop();
		bookShopClonned.setShopName(this.getShopName());
		for (Book book : this.getListBooks()) {
			bookShopClonned.getListBooks().add(book);
		}
		
		return bookShopClonned;
	}



}
