package com.ae.ae2.ex2;

import java.util.Scanner;

import com.ae.ae2.ex2.Student;

public class StudentInput {
	
	//addArray
	//1. 새로운 배열 생성 길이는 기존 배열보다 1칸 많게
	//2. 기존 배열 값을 복사하고 마지막 칸에 st 대입, 

	public Student[] addArray(Student []arst) {
		
		Student[] arst2 = new Student[arst.length+1];
		
		for(int i=0; i<arst.length; i++) {
			arst2[i] = arst[i];
			
	}	return arst2;
		
}
	
	
	//메서드명 makeStudent
	//학생 한명 생성
	//이름 번호 국어 영어 수학 입력받고 총점 평균 계산
	//지워도 메뉴에 에러안뜨게
	
	public Student makeStudent() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("이름을 입력하세요.");
		student.name = sc.next();
		System.out.println("번호 입력");
		student.num = sc.nextInt();
		System.out.println("국어 입력");
		student.kor = sc.nextInt();
		System.out.println("영어 입력");
		student.eng = sc.nextInt();
		System.out.println("수학 입력");
		student.math = sc.nextInt();
		
		student.total = student.kor+student.eng+student.math;
		student.avg = student.total/3.0;
		
		return student;
		
		
	}
	
	
	
 	
	
	
}
