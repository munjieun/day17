package inteface;

class Aarmy {
	public void attackA() {
		System.out.println("지상군이 공격합니다.");
	}
	public void defenceA() {
		System.out.println("지상군이 방어합니다.");
	}
}

class Barmy {
	public void attackB() {
		System.out.println("공군이 공격합니다.");
	}
	public void defenceB() {
		System.out.println("공군이 방어합니다.");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Aarmy a = new Aarmy();
		Barmy b = new Barmy();
		//이름이 다양하게 만들어져서 어떤기능인지 모를 수 있으므로 인터페이스로 미리 지정해서 사용한다.
	}
}
