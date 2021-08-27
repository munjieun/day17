package overriding;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;

class Timer extends Thread{
	Date d;
	SimpleDateFormat simple;
	public void setTime() {
		d = new Date();
		simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		System.out.println(simple.format(d));
	}
	public void timer_10() {
		for(int i=0; i<10; i++) {
			setTime();
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class LoginSystem extends Window{
	private String id = null, pw = null, newId = null, newPw = null;
	HashMap map = new HashMap();
	
	public void disLog() {
		while(true) {
			System.out.println("1.로그인   2.가입   3.로그아웃");
			System.out.print(">>> "); int num = sc.nextInt();
			switch(num) {
			case 1 : login(); break;
			case 2 : joinId(); break;
			case 3 : logout(); break;
			default : System.out.println("잘못입력하셨습니다."); break;
			}
		}
	}
	public void login() {
		System.out.print("아이디 입력 : "); id = sc.next();
		System.out.print("비밀번호 입력 : "); pw = sc.next();
		if(map.isEmpty()) {
			System.out.println("가입된 내역이 없습니다.");
		}else if(map.containsKey(id)) {
			if(pw.equals((String)map.get(id))) {
				System.out.println("인증 성공");
				MyJframe mf = new MyJframe();
				mf.start();
				mf.setDaemon(true);
				disWin();
				
			}else {
				System.out.println("비밀번호를 확인해주세요.");
			}
		}else {
			System.out.println("인증 실패");
		}
	}
	public void joinId() {
		System.out.print("가입 아이디 입력 : "); newId = sc.next();
		System.out.print("가입 비밀번호 입력 : "); newPw = sc.next();
		if(map.isEmpty()) {
			map.put(newId, newPw);
			System.out.println("저장 완료");
		}else if(map.containsKey(newId)) {
			System.out.println("이미 가입된 아이디입니다.");
		}
	}
	public void logout() {
		System.exit(0);
	}
}
class Window extends Timer{
	Scanner sc = new Scanner(System.in);
	public void disWin() {
		System.out.println("===== 환 영 합 니 다 =====");
		while(true) {
			System.out.println("1.기능   2.OFF");
			System.out.print(">>> "); int num = sc.nextInt();
			switch(num) {
			case 1 : winFunc(); break;
			case 2 : System.exit(0); break;
			default : System.out.println("잘못입력하셨습니다."); break;
			}
		}
	}
	public void winFunc() {
		System.out.println("사용 가능 기능");
		System.out.println("1.메모장   2.계산기");
		System.out.print("사용할 기능 입력 : "); String func = sc.next();
		
	}
}
class MyJframe extends Timer{
	JFrame frame;
	Container c;
	JLabel label;
	Font font;
	public MyJframe() {
		frame = new JFrame("Time");
		c = frame.getContentPane();
		label = new JLabel();
		font = new Font(null, 0, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		c.add(label);
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run() {
		for(;;) {
			label.setText("안녕");
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Timer t = new Timer();
		
		t.timer_10();
		
		
		
	}
}
