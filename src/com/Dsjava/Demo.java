package com.Dsjava;



public class Demo {
 public static void main(String[] args) {
     Car car = new Car();
     car.setId(10);  // <-- Added missing semicolon
     System.out.println(car.getId());
 }
}

