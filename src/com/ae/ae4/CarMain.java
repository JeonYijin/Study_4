package com.ae.ae4;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car(); //클래스명 참조변수명 = new 생성자메서드명()
		//car.Car(); 객체 생성하면서 호출될 때 한번만 사용가능 멤버 메서드처럼 사용 불가능
		
		Car car2 = new Car("Red");
		
		Car car3 = new Car("pink", 70000000);
		
		
		//Scanner처럼 무조건 값을 입력받기 위해 기본 생성자가 없는 메서드도 있
		
		
		car.info();
		
		car2.info();
		car3.info();
		
	
	}

}
