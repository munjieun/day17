package inteface;

class A {
	public void print() {
		System.out.println("A클래스");
	}
}

class B extends A{
	public void print() {
		System.out.println("B클래스");
	}
}

class C extends A{
	public void print() {
		System.out.println("C클래스");
	}
}

public class Ex01_UpCast {
	public static void main(String[] args) {
		/*
		B b = new B();
		b.print();
		C c = new C();
		c.print();
		*/
		A a = new B();
		//자식형태에서 부모형태로 변환하는 것을 업캐스팅이라고 말한다. 캐스팅=형변환
		a.print();
		a = new C();
		a.print();
	}
}
