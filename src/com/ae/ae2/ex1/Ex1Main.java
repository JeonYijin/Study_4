package com.ae.ae2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("Ex1 Start");
		
		Phone phone = new Phone();
		phone.company = "Samsung";
		phone.brand = "Galaxy Note 20 Ultra";
		phone.color = "white";
		phone.size = 18;
		phone.price = 1540000;
		
		Phone phone2 = new Phone();
		phone2.company  = "Apple";
		phone2.brand ="iphone 8";
		phone2.color = "rose gold";
		phone2.size = 5;
		phone2.price = 980000;
		
		PhoneView phview = new PhoneView();
		
		phview.view(phone);
		
		Phone [] phones = new Phone[2];
		
		phones[0] = phone;
		phones[1] = phone2;
			
		phview.sumph(phones);
		
		
		
		System.out.println("Ex1 Finish");
	}

}
