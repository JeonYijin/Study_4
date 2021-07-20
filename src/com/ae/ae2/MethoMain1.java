package com.ae.ae2;

import java.util.Scanner;

public class MethoMain1 {

	public static void main(String[] args) {
		
		System.out.println("Method1 Start");
		
		Method1 mth1 = new Method1();
		
		//참조변수명.메서드();
		//메서드 호출
		mth1.prn();
		System.out.println();
		
		//prn2 호출
		//mth1.prn2();//원하는 횟수만큼 출력을 원할때
		
		//int num =20; //prn2에 num이라는 변수가 있지만 선언이 되는이유?
		//중복선언이 아님 =>prn2에서 만든 num은 지역변수기 때문에 prn2가 종료되면 사라짐
		//멤버변수(heap영역에 있는 변수)는 주소만 알면 언제든 쓸 수 있음
		
		Scanner sc = new Scanner(System.in); //이 방법은 어쩔 수 없을 때
		System.out.println("횟수를 입력하세요.");
		int count = sc.nextInt();
//		
//		for(int i=0; i<count; i++) {
//			mth1.prn3();
//		}
//	
		
		
		mth1.prn4(count); //매개변수를 안넣으면 에러, 인자값 parameter argument
		
		
		System.out.println();
		System.out.println("Method1 finish");
	}

}
