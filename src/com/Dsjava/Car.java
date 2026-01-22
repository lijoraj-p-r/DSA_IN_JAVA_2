package com.Dsjava;



public class Car {
String brand;
String name;

private double idto = 10;

private int id = 1010;

       
    
public void setId(int id) {
	this.id = id;
}

public int getId() {
	return id;
}

public void driver() {
	System.out.println(name + "Car is driving is a brand of " + brand );
	System.out.println(id);
}

}
