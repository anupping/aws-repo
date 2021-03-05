package com.lambda.lambdaOne;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Inventory {

	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Inventory(int i, String name, int j, int k) {
		this.id=i;
		this.name=name;
		this.price=j;
		this.quantity=k;
	}

	public String getName() {
		return name;
	}


}
