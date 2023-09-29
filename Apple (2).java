package com.app.fruits;

public class Apple extends Fruit {

	public Apple (String color, double weight, String name)
	{
		super( color,  weight,  name);
	}
	@Override
	public String toString() {
		return super.toString()+" "+taste();
	}
	public void jam()
	{
		System.out.println(" Creating JAM!" );
	}

	public String taste()
	{
		return "sweet and sour";
	}
}
