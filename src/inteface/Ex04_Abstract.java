package inteface;

abstract class Abstract {
	protected int num;
	public void setNum(int num) {
		this.num = num;
	}
	public abstract void combo();
}
class NewAbstract extends Abstract {
	public void combo() {
		System.out.println(num + "단 공격 + 발차기");
	}//추상화는 부모의 메소드는 비워두고 자식에서 메소드를 재정의 해주어야한다.
}
public class Ex04_Abstract {
	public static void main(String[] args) {
		NewAbstract na = new NewAbstract();
		na.setNum(3);
		na.combo();
		
	}
}
