package com.ae6;

public class ClassStudy1 {

	public static void main(String[] args) {
		//메인 메서드의 용도는 프로그램을 시작하는 용도
		//또는 메서드 테스트 용도
		
		System.out.println("Study1");
		
		//학생 1명 생성
		//클래스명 변수명 = new 클래스명();
		
		Student st = new Student(); 
		
		Student st2 = new Student();
		//System.out.println(st);
		//System.out.println(st2);
		
		
		//멤버의 접근(사용)
		//참조변수명.연산
		st.name = "ododo";
		st.num = 1;
		st.kor = 30;
		st.eng = 40;
		st.math =45;
		System.out.println(st.name);
		
		//st의 총점을 계산해서 입력하고 출력
		
		st.total = st.kor + st.eng + st.math;
		System.out.println(st.total);
		//st의 평균을 계산해서 대입하고 출력
		
		st.avg = st.total/3.0;
		System.out.println(st.avg);
		
		//System.out.println(st == st2);
		
		
		st2.num =1;
		System.out.println(st.num ==st2.num);
		
		
		
		
		
		
		
		
	}

}
