package inteface;
interface test{
	//public int num; 인터페이스는 변수를 지정할 때 값을 초기화하지 않으면 오류가 뜬다.
	public int num = 4000;
	public static int num2 = 5555;
	public static final int num3 = 5555;
}
class AAAAA{
	public int aaa = 5000;
	public static int bbb = 5000;
	public static final int ccc = 5000;
}
public class Ex08 {
	public static void main(String[] args) {
		System.out.println(test.num);
		//인터페이스는 객체를 생성하지 않고 변수를 가져다 쓸 수 있다.
		//static 변수를 가져다 쓸 수 있듯이 인터페이스에서는 static이 생략된 모습이라고 볼 수 있다.
		//test.num = 7878;
		System.out.println(test.num);
		//출력은 되지만 변경은 불가능
		AAAAA.bbb = 21;
		//AAAAA.ccc = 21; 파이널은 값 변경 불가
		//따라서 인터페이스의 변수는 static final로 만들어진다.
		
	}
}
