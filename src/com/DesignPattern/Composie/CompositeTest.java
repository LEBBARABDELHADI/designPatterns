package com.DesignPattern.Composie;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Composite computer = new Composite("computer",300);
		Composite uniteCentrale = new Composite("UC", 200);
		Component motherBoard = new Leaf(100);
		Component motherBoardb = new Leaf(2200);
		Component ram = new Leaf(125);
		Component cpu= new Leaf(75);
		
		computer.addComponent(motherBoard);
		computer.addComponent(motherBoardb);
		computer.addComponent(uniteCentrale);

		uniteCentrale.addComponent(ram);
		uniteCentrale.addComponent(cpu);
		
		computer.showPrice();
	}

}
