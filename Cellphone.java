package Chap06;

public class Cellphone {
	//필트(속성)
	String model;
	String color;
	
	//생성자
	
	public Cellphone(String model, String color) {
		this.color=color;
		this.model=model;
	}
	//메서드
	void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	void bell(){
		System.out.println("벨이 울립니다");
	}
	void reciveVoice(String msg) {
		System.out.println("상대방 "+msg);
	}
	void sendVoice(String msg) {
		System.out.println("자기 "+msg);
	}
	void hangUP() {
		System.out.println("전화를 끊습니다.");
	}
}

