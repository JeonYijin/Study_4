package com.ae.ex1;

public class Ex1Main2 {

	public static void main(String[] args) {
		
		System.out.println("Main2 Start");
		
		Pet pet1 = new Pet();
		pet1.name="말랑";
		
		Pet pet2 = new Pet();
		pet2.name ="뽀짝";
		
		//배열 배열은 같은 데이터 타입만 묶음
		//pet을 담을 수 있는 배열을 선언
		//모으려고 하는 데이터타입 [] 변수명 = new 데이터타입 [길이]
		Pet[] pe = new Pet[2];
		pe[0] = pet1;
		pe[1] = new Pet();
		pe[1].name = "뿌스러기";
		
		for(int i=0; i<pe.length; i++) {
			System.out.println(pe[i].name);
		}
		
		System.out.println(pe[0].name);
		System.out.println(pe[1].name);
		
		Character c1 = new Character();
		
		c1.p1 = pet1;
		c1.p2 = pet2;
		
		System.out.println(c1.p1.name);
		System.out.println(c1.p2.name);
		
		
		
		
		System.out.println("Main2 Finish");
	}

}
