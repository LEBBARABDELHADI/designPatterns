package com.DesignPattern.Composie;

import java.util.ArrayList;
import java.util.List;

public class Composite  implements Component{

	String name ;
	int price;
	public Composite(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	List<Component> arrayComp =new ArrayList<Component>();
	
	void addComponent(Component comp) {
		arrayComp.add(comp);
	}
	@Override
	public void showPrice() {
		System.out.println("the composite name is : "+name +" and the price"
				+ " is : "+ price);
		for(Component comp : arrayComp) {
			comp.showPrice();
		}
	}
	

	
	
}
