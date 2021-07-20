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
		

		//1.전체 정보 출력
		//2.학생 번호 검색 같은 번호 학생 출력
		//3. 1,2번 끝나고 시간 남으면 학생 정보 추가 - 학생 한명을 배열에 추가
		//4. 성적순으로 출력 - 제일 높은애부터 정렬
		//5. 프로그램 종료
		
		boolean flag = true;
		while(flag) {
			System.out.println("1.전체 정보 출력");
			System.out.println("2.학생 번호 검색");
			System.out.println("3.학생 정보 추가");
			System.out.println("4.성적 순서 정렬");
			System.out.println("5.프로그램 종료");
			
			System.out.println("번호를 입력하세요>>");
			int n = sc.nextInt();
			boolean check = false;
			switch(n) {
			case 1:
				System.out.println("전체 정보를 출력합니다.");
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
				break;
			case 2:
				System.out.println("학생 번호를 검색합니다. 번호를 입력하세요.");
				int number = sc.nextInt();
				for(int i=0; i<arst.length; i++) {
					if(number==arst[i].num) {
						System.out.println("이름: "+arst[i].name);
						System.out.println("번호: "+arst[i].num);
						System.out.println("국어: "+arst[i].kor);
						System.out.println("영어: "+arst[i].eng);
						System.out.println("수학: "+arst[i].math);
						System.out.println("총점: "+arst[i].total);
						System.out.println("평균: "+arst[i].avg);
						check = true;
					}
				}
				
				if(check == false) {
					System.out.println("없는 번호입니다.");
				}
				break;
			case 3:
				System.out.println("학생 정보를 추가합니다.");
				Student[] arst2 = new Student[arst.length+1];
				Student student2 = new Student();
				System.out.println("새로운 학생의 이름을 입력하세요>>");
				student2.name = sc.next();
				System.out.println("새로운 학생의 번호를 입력하세요>>");
				student2.num  = sc.nextInt();
				System.out.println("새로운 학생의 국어점수를 입력하세요>>");
				student2.kor  = sc.nextInt();
				System.out.println("새로운 학생의 영어점수를 입력하세요>>");
				student2.eng  = sc.nextInt();
				System.out.println("새로운 학생의 수학점수를 입력하세요>>");
				student2.math  = sc.nextInt();
				student2.total  = student2.kor+ student2.eng+ student2.math; 
				student2.avg  = student2.total/3.0;
				for(int i=0; i<arst.length; i++) {
					arst2[i] = arst[i];
					
				} arst2[arst2.length-1] = student2;	
				arst = arst2;
				break;
				
			case 4:
				System.out.println("성적순으로 정렬합니다.");
				for(int i=0; i<arst.length-1; i++) {
					for(int j= i+1; j<arst.length; j++) {
						if(arst[i].avg<arst[j].avg) {
							double tmp = arst[i].avg;
							arst[i].avg = arst[j].avg;
							arst[j].avg = tmp;
							
							String t = arst[i].name;
							arst[i].name = arst[j].name;
							arst[j].name = t;
							
							int tt = arst[i].kor;
							arst[i].kor = arst[j].kor;
							arst[j].kor = tt;
							
							int ttt = arst[i].eng;
							arst[i].eng = arst[j].eng;
							arst[j].eng = ttt;
							
							int t4 = arst[i].math;
							arst[i].math = arst[j].math;
							arst[j].math = t4;
							
							int t5 = arst[i].total;
							arst[i].total = arst[j].total;
							arst[j].total = t5;
							
							int t6 = arst[i].num;
							arst[i].num = arst[j].num;
							arst[j].num = t6;
							
						}
					}
				}
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
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
//		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
//		System.out.println("===================================================");
//		
//		for(int i=0; i<arst.length; i++) {
//			System.out.print(arst[i].name+"\t");
//			System.out.print(arst[i].num+"\t");
//			System.out.print(arst[i].kor+"\t");
//			System.out.print(arst[i].eng+"\t");
//			System.out.print(arst[i].math+"\t");
//			System.out.print(arst[i].total+"\t");
//			System.out.println(arst[i].avg);
//			System.out.println("=============================================================");
//			
//			
//			
//		}
//		
		System.out.println("Study2 Finish");
	}

}
