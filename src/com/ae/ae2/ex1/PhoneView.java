package com.ae.ae2.ex1;

public class PhoneView {
	
	public void view(Phone phone) {

		System.out.println("제조사: "+phone.company);
		System.out.println("브랜드: "+phone.brand);
		System.out.println("색깔: "+phone.color);
		System.out.println("크기: "+phone.size);
		System.out.println("가격: "+phone.price);
		
	}
	
	//핸드폰 여러 개의 합계 금액을 계산해서 출력
	//핸드폰의 개수는 여러개 - 매개변수 하나만 선언
	
	
	
	public void sumph(Phone [] phones) {
		
		int sum = 0;
		for(int i=0; i<phones.length; i++) {
			sum = sum +phones[i].price;
		}
		System.out.println("합계는: "+ sum);
	}
	
	
	
}
