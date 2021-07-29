package com.ae.ae4;

public class Car {
	
	String company;  //staic String company = "kIA"; -> 아래 this.company를 지움
	String brand;
	String color;
	int price;
	int gitong;
	
	
	//생성자
	
	public 	Car() {
		this("Black", 20000000); //자기 자신의 또 다른 생성자 호출
		//자기 자신의 또 다른 생성자이면서 매개변수가 string인 것을 찾음
		
		
	
	}
	
	public Car(String color) { //생성자를 두개 이상 하려면 메서드 오버로딩
//		this.company = "Kia";
//		this.brand = "K7";
//		this.color = color;
//		this.price = 5000000;
//		this.gitong = 8;
		
		this(color, 50000000); //첫 줄에 있어야 함
		System.out.println("Success");// this()아래엔 뭐가 있어도 되지만 위는 안됨
	}
	
	public Car(String color, int price) { //생성자를 두개 이상 하려면 메서드 오버로딩
		this.company = "Kia"; //지우기 static 클래스 변수로 지정했을 때
		this.brand = "K7";
		this.color = color;
		this.price = price;
		this.gitong = 8;
	}
	
	
	public void info() {
		System.out.println("Company: " + this.company); // Car.company로 바꾸기
		System.out.println("Brand: " + this.brand);
		System.out.println("Color: " + this.color);
		System.out.println("Price: " + this.price);
		System.out.println("Gitong: " + this.gitong);
		System.out.println("---------------------------------");
		
	}
	
	
	
}
