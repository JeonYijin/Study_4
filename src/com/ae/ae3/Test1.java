package com.ae.ae3;

public class Test1 {
	
	//멤버변수
	int num;
	int num2;
	
	//멤버메서드
	public void info() {
		//메서드 내에서 다른 메서드 호출 가능
		System.out.println("Info Method 실행");
		System.out.println(num);
		
		this.info2();
	}
	
	public void info2() {
		System.out.println(num*num2);
		System.out.println("This: "+this);
		//변수의 색깔이 파란색이면 멤버변수 다른색이면 지역변수
		//멤버 변수 this.num과 this.num2
	}
	
	public void info3(int num) { // 매개변수는 메서드 내에 선언되기 때문에 stack에 생성
		System.out.println(this.num- num); //멤버변수는 heap에 생성
	}
	
	
	
}
