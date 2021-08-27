package inteface;

import java.util.ArrayList;
class Aclass {
	public String print() {
		return "A클래스";
	}
}
public class Ex03_UpCast {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add(111);
		arr.add("111");
		arr.add(1.11);
		
		Object b = 100; //모든 형태의 부모인 Object로 만들었으므로 업캐스팅
		Object s = "test";
		Object d = 1.111;
		
		int bb = (int)b + 200; //부모형태를 다시 자식형태로 변환, 다운캐스팅
		
		Object a = new Aclass(); //업캐스팅
		
		Aclass aa = (Aclass)a; //다운캐스팅
		
	}
}
