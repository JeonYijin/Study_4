package com.ae.ae2.ex2;

import java.util.Scanner;

public class StudentController {

	//메서드명 start
	//1.전체 정보 출력 - 출력하겠습니다 검색하겠습니다 등등 출력문만 나오면됨
	//2.학생 번호 검색 같은 번호 학생 출력
	//3. 1,2번 끝나고 시간 남으면 학생 정보 추가 - 학생 한명을 배열에 추가
	//4. 성적순으로 출력 - 제일 높은애부터 정렬
	//5. 프로그램 종료
	
	public void start() {
		StudentView sv = new StudentView();
		StudentInput si = new StudentInput();
		StudentSort ss = new StudentSort();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요>>");

		int count = sc.nextInt();
		//학생을 모을 배열 선언
		Student [] arst = new Student[count]; 
					
				
		for(int i=0; i<arst.length; i++) {
			//Student student =  si.makeStudent();
			//arst[i] = student;
			
			arst[i] = si.makeStudent();
		}
		
		
		while(flag) {
			System.out.println("1.전체 정보 출력");
			System.out.println("2.학생 정보 검색");
			System.out.println("3.학생 정보 추가");
			System.out.println("4.성적순으로 출력");
			System.out.println("5.종료");
			int num= sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("전체 학생 정보를 출력합니다");
				sv.viewAll(arst);
				break;
			case 2:
				System.out.println("학생번호 입력");

				int number = sc.nextInt();
				Student student = null;
				
				for(int i=0; i<arst.length; i++) {
					if(arst[i].num == number) {
						student = arst[i] ;
						break;
					}
				}
				if(student != null) {
					sv.viewOne(student);
				}
				break;
			case 3:
				System.out.println("학생 정보를 추가합니다.");
//				  Student [] arst2= si.addArray(arst);  //새로운걸 만들 필요 없이 원래 있던것에 넣기
//				  arst = arst2;
//				  arst2[arst2.length-1] = st;
				
				Student st = si.makeStudent();
				arst = si.addArray(arst);
				arst[arst.length-1] = st; 
				
				
				break;
			case 4:
				System.out.println("성적순으로 출력합니다.");
				Student[] sort =  ss.sortByAvg(arst); //다시 1번을 눌렀을 때 정렬이 안된 상태로 만들기 위해
				//새로운 배열 만들어서 정렬 담당 배열 만들기
				sv.viewAll(sort);
				break;
			default :
				System.out.println("종료합니다.");
				flag = !flag;
			
			}
		}
		
	}
	
	
	
	
	
}
