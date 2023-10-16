package com.DesignPattern.Composie;

public class Leaf  implements Component{

	int price;
	public Leaf( int price) {
	
		this.price = price;
	}
	@Override
	public void showPrice() {
		System.out.println("the leaf price"
				+ " is : "+ price);
	}

}
