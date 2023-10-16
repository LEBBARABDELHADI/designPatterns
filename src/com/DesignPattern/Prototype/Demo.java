package com.DesignPattern.Prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author alpacino
 *
 */
public class Demo  {

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bookShop =new BookShop();
	    bookShop.setShopName("Voltaire");
	    bookShop.loadBooks();
		System.out.println(bookShop);
		
		// deep  remove the remove on bookShop will not affect bookShopClone
		BookShop bookShopClone =bookShop.clone();
		bookShop.getListBooks().remove(2);
		
		System.out.println(bookShop);
		System.out.println(bookShopClone);
//		
//		
//		List<String> listString = Arrays.asList(
//				"fs","ds","ds"
//				);
//		for (String string : listString) {
//			System.out.println(string);
//		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		 String initList[] = { "One", "Two", "Four", "One",};

	        // create one list
	        List list = new ArrayList(Arrays.asList(initList));

	        System.out.println("List value before: "+list);

	        // create singleton list
	        list = Collections.singletonList("OnlyOneElement");
//	        list.add("five"); //throws UnsupportedOperationException
	        System.out.println("List value after: "+list);
		
	        System.out.println("test	");
	}
	

}
