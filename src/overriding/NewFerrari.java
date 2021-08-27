package overriding;

public class NewFerrari extends Ferrari{
	public NewFerrari(int ye) {
		super(ye);
		//부모가 생성자에서 값을 받는데 상속받는 자식에서 받는값이 없으면 에러가 뜸
	}
	public void autoSystem() {
		System.out.println("자동 운전모드를 시작합니다!");
	}
	/*
	public void speed() {
		System.out.println(getYe() + "년식 페라리 속도 : 500km");
		System.out.println("터보 speed 달리자~");
	}//부모가 public인데 자식이 private같이 접근제한자가 더 작은 범위를 가지면 안된다.
	*/
	
}
