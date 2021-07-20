package com.ae.ae2;

import java.util.Scanner;

public class Method1 {
		
	//접근지정자 [그외 지정자] 리턴타입 메서드명([매개변수 선언들]){}
	//public static void main(String[] args){}
	
	//접근지정자 모르거나 확신이 없으면 public
	//그외지정자 모르거나 확신이 없으면 쓰지마
	//리턴타입 모르거나 확신이 없으면 void
	//매개변수 모르거나 확신이 없으면 쓰지마
	
	
	public void prn() {
		System.out.println("prn method 실행");
	}
	
	//prn2 선언, hello world 3번출력
	public void prn2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 횟수를 입력하세요.");
		int count = sc.nextInt();
		
		int num =10;//primitive, 지역변수, 참조변수x 
		for(int i =0; i<count; i++) {
			System.out.println("Hello World!");
		}
		System.out.println("Num: "+ num);
	}
	
	public void prn3(){
		System.out.println("Hello World!");
	}
	
	public void prn4(int num) {//여기선 선언만 할테니까 넣는건 메인에서 넣어라
		for(int i =0; i<num; i++) { //메인메서드에서 받은 숫자만큼 num에 입력되게끔
			System.out.println("Hello World!");
		}
	}
	
	
	
}
