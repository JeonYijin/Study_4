package com.ae.ae3;

public class Test2 {
	
	//public void t1(int n1, int n2) {} 같은 타입의 매개변수를 받으면 중복선언
	
	//public void t1(int n2, int n1) {} 변수명 순서 바꾸는건 상관 없음 무조건 타입의 구성이나 갯수가 달라야함
	
	public int t1(int n2, int n1, int n3) { //리턴 타입 다른것도 상관 없음
		return 0;
	}
	
	public void t1(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public void t1(int n1, double n2) {
		System.out.println(n1+n2);
	}
	
	
	
}
