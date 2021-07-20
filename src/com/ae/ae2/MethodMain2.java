package com.ae.ae2;

import java.util.Random;

public class MethodMain2 {

	public static void main(String[] args) {
		
		Method2 m2 = new Method2();
		m2.t1();
		
		String name = m2.t2();
		
		System.out.println(name);
		
		int num = m2.t3(59786,978731); //리턴타입에 맞는 변수 선언해서 넣어주기
		
		System.out.println(num);
		
		int [] arr =m2.t4();
		
		Random random = new Random();
		int r = random.nextInt();
		
		System.out.println(r);
	}

}
