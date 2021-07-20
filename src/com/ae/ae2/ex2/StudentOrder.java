package com.ae.ae2.ex2;

public class StudentOrder {

	//성적순으로 나오게 하기 높은 - 낮은 순
	//메서드명 임시: makeOrder
	
	public void makeOrder(Student [] arst) {
		
		
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
		
		
		
	}
	
	
	
	
	
	
}
