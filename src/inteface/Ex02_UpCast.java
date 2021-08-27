package inteface;
class Parents {
	public void familyName() {
		System.out.print("이");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents {
	public void name() {
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents {
	public void name() {
		familyName();
		System.out.println("기광");
	}
}
public class Ex02_UpCast {
	public static void main(String[] args) {
		Parents par = new Parents();
		par.name();
		
		Daughter d = new Daughter(); d.name();
		Son s = new Son(); s.name();
		
		System.out.println("---------------");
		
		par = new Daughter(); par.name();
		par = new Son(); par.name();
		
		Son sss = (Son)par;//다운캐스팅
		//부모의 형태에서는 자식의 메소드가 보이지 않는다.
	}
}
