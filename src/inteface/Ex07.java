package inteface;

import java.util.Scanner;

interface Abettle {
	public void attack(); //공격을 만드세요
	public void defense(); //방어를 만드세요
}

class Carmy implements Abettle{
	@Override
	public void attack() {
		System.out.println("지상군 공격");
	}
	@Override
	public void defense() {
		System.out.println("지상군 방어");
	}
}

class Darmy implements Abettle{
	@Override
	public void attack() {
		ready();
		System.out.println("공군 공격");
	}
	@Override
	public void defense() {
		System.out.println("공군 방어");
	}
	public void ready() {
		System.out.println("공격 준비");
	}
}
public class Ex07 {
	public static void main(String[] args) {
		/*
		Carmy c= new Carmy();
		Darmy d= new Darmy();
		
		c.attack(); c.defense();
		d.attack(); d.defense();
		//자식으로 만들면 불필요한 부가기능까지 보여져서 코드를 합칠 때 헷갈릴 수도 있다.
		Abettle dd = new Darmy();
		//부모로 업캐스팅하면 자식의 부가기능이 안보여서 불필요한 기능을 안봐도 되기 때문에 선택이 수월하다.
		*/
		Abettle ab = null;
		Scanner input = new Scanner(System.in);
		int num = 0, choice = 0;
		System.out.println("적이 쳐들어 왔습니다.");
		System.out.println("1.지상군   2.공군");
		num = input.nextInt();
		if(num == 1) {
			System.out.println("지상군을 선택하였습니다.");
			ab = new Carmy();//지상군
		}else {
			System.out.println("공군을 선택하였습니다.");
			ab = new Darmy();//공군
		}
		System.out.println("1.공격   2.방어");
		choice = input.nextInt();
		if(choice == 1) {
			ab.attack();
		}else {
			ab.defense();
		}
		//부모형태로 받아서 처리하면 객체를 따로따로 만들 필요없이 선택에 따라 달라져서 if문이 줄어들 수 있다.
		/*
		if(choice == 1 && num == 1) {
			c.attack();
		}else if(choice == 2 && num == 1){
			c.defence();
		}
		if(choice == 1 && num == 2) {
			d.attack();
		}else if(choice == 2 && num == 2){
			d.defence();
		}
		*/
		
	}
}
