package com.ae.ae2.ex2;

import java.util.Scanner;

public class StudentView {
	
	//메서드명 viewAll
	//menu에서 1번 선택시 실행하는 메서드, 전체 학생 정보 출력
	
	//메서드명 viewOne, 2번 선택시 실행하는 메서드 학생 한명 정보만 출력
	public void viewOne(Student student){ //for문 필요없음 필요할때마다 호출할 예정
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===================================================");
		
		System.out.print("이름: "+student.name+"\t");
		System.out.print("번호: "+student.num+"\t");
		System.out.print("국어: "+student.kor+"\t");
		System.out.print("영어: "+student.eng+"\t");
		System.out.print("수학: "+student.math+"\t");
		System.out.print("총점: "+student.total+"\t");
		System.out.println("평균: "+student.avg+"\t");
		System.out.println("=============================================================");
	}
	
	//전체 학생 정보 출력하는 메서드
	
	public void viewAll(Student[] arst) {
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
	}
	
	
	
}
