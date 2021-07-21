package com.ae.ae2.ex2;

public class StudentSort {

	//성적순으로 나오게 하기 높은 - 낮은 순
	//메서드명 임시: makeOrder
	//sortbyAVG
	
	public Student [] sortByAvg(Student [] arst) {
		
		
		for(int i=0; i<arst.length-1; i++) {
			for(int j= i+1; j<arst.length; j++) {
				if(arst[i].avg<arst[j].avg) {
					Student tmp = arst[i];
					arst[i] = arst[j];
					arst[j] = tmp;

					
				}
			}
		}
		
		return arst;
		
		
	}
	
	
	
	
	
	
}
