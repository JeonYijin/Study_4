package com.ae6;

import java.util.Scanner;

public class ClassStudy_2 {

	public static void main(String[] args) {
		
		System.out.println("Study2 Start");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요>>");
		
		//학생 수 입력받고 학생 수 만큼 정보를 입력받기 - 이름, 번호, 국어, 영어, 수학 입력받기
		//총점, 평균
		
		int count = sc.nextInt();
		
		//String name = sc.next();
		
		//학생을 모을 배열 선언
		Student [] arst = new Student[count]; 
			
		
		for(int i=0; i<arst.length; i++) {
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
			
			arst[i] = student;
		}
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===================================================");
		
		for(int i=0; i<arst.length; i++) {
			System.out.print(arst[i].name+"\t");
			System.out.print(arst[i].num+"\t");
			System.out.print(arst[i].kor+"\t");
			System.out.print(arst[i].eng+"\t");
			System.out.print(arst[i].math+"\t");
			System.out.print(arst[i].total+"\t");
			System.out.println(arst[i].avg);
			System.out.println("=============================================================");
			
			
			
		}
		
		//모든 학생의 정보 출력
		
			
		
		System.out.println("Study2 Finish");
	}

}
