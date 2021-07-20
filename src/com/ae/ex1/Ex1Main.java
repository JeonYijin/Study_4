package com.ae.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		System.out.println("Ex1 start");
		
		//캐릭터생성
		//이름,레벨, 체력, 마나, 골드 입력 각각 출력
		
		Character ch = new Character();
		
		ch.name = "aespa";
		ch.level = 1;
		ch.hp = 100;
		ch.mp = 50;
		ch.gold = 10;
		System.out.println(ch.wp);
		
		//ch가 가지고 있는 무기의 이름을 출력
		//System.out.println(ch.wp.name);
		
		
		System.out.println("name: "+ch.name);
		System.out.println("level: "+ch.level);
		System.out.println("hp: "+ch.hp);
		System.out.println("mp: "+ch.mp);
		System.out.println("gold: "+ch.gold);
		
		System.out.println();

		//무기
		Weapon wp = new Weapon();
		wp.name = "pos";
		wp.damage = 20;
		wp.critical = 0.5;
		wp.upgrade = 30;
		
		ch.wp =  wp; //Weapon 타입이라 사용 가능  -> ch.wp에 wp의 주소가 저장
		
		//ch가 가지고 있는 무기의 이름을 출력
		System.out.println(ch.wp.name);
		
		//ch가 가지고 있는 무기의 이름을 변경 하고 출력
		ch.wp.name = "검";
		System.out.println(ch.wp.name); //-> reference 타입 ->메모리 영역은 멤버변수 ->실제 데이터를
		//가진 주소를 담고 있음
		
		
		//ch.wp --> reference 타입 -> 메모리 영역으로 구분하면 멤버변수 -->실제 데이터를 가리키는 주소가 저장된
		//참조변수
		
		
		
		wp.name = "도끼"; //ch.wp.name이 아니라 wp.name에 저장했는데 바뀌는 이유? wp객체의 주소가 저장되어있어서
		System.out.println(ch.wp.name);
		
		System.out.println();	
		//몬스터 - 이름 레벨 체력 마나 골드
		
		Monster mon = new Monster();
		mon.name = "black mamba";
		mon.level = 2;
		mon.hp = 200;
		mon.mp = 50;
		mon.gold = 15;
		mon.wp = new Weapon(); // ch.wp = wp;와 비슷하지만 변수를 덜 만들게 이용하는것  
		mon.wp.name = "창";
		mon.wp.damage = 100;
		mon.wp.critical = 0.5;
		mon.wp.upgrade = 3;
		
		//ch = monster; 타입이 달라서 에러
		ch.gold = ch.gold + mon.gold; //같은 데이터타입이라 가능
		//변수 선언이라는 말은 어떤 데이터 타입을 담을 것이라고 선언하는 것
		//멤버 변수도 똑같음
		
		//몬스터 무기를 내무기로 바꾸기
		//ch.wp.name = mon.wp.name; 
		ch.wp = mon.wp;
		
		
		System.out.println("name: "+mon.name);
		System.out.println("level: "+mon.level);
		System.out.println("hp: "+mon.hp);
		System.out.println("mp: "+mon.mp);
		System.out.println("gold: "+mon.gold);
		System.out.println("Weapon: " + ch.wp.name);
		System.out.println("Weapon damage: " +ch.wp.damage);
		//mon = null;
		
		mon = new Monster();
		System.out.println(mon.level);
		
		
		System.out.println("Ex1 finish");
	}

}
