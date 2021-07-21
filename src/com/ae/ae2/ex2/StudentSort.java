package com.ae.ae2.ex2;

public class StudentSort {

	//성적순으로 나오게 하기 높은 - 낮은 순
	//메서드명 임시: makeOrder
	//sortbyAVG
	
	public Student [] sortByAvg(Student [] arst) {
		
		Student [] copy = new Student[arst.length];
		
		for(int i=0; i<arst.length; i++) {
			copy[i] = arst[i];
		}
		
		
		for(int i=0; i<copy.length-1; i++) {
			for(int j= i+1; j<copy.length; j++) {
				if(copy[i].avg<copy[j].avg) {
					Student tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;

					
				}
			}
		}
		
		return copy;
		
		
	}
	
	
	
	
	
	
}
