package Chap07;
interface Wearable{
	void putOn();
	void putOff();
}
interface Skinnable{
	int Black=0;
	int Red=1;
	int Green=2;
	int Blue=3;
	int Yellow=4;
	void changeSkin(int black2);
}
class Head implements Wearable,Skinnable{
	public int skin;
	public void putOn() {
		System.out.println("디스플레이를 작용했습니다");
	}
	public void putOff() {
		System.out.println("디스플레이를 벗었습니다");
	}
	public void changeSkin(int skin) {
		this.skin=skin;
	}
	public void putSkin() {
		switch(skin) {
		case Black:
			System.out.println("BLACK DISPLAY");break;
		case Red:
			System.out.println("RED DISPLAY");break;
		case Green:
			System.out.println("Green DISPLAY");break;
		case Blue:
			System.out.println("BLUE DISPLAY");break;
		case Yellow:
			System.out.println("YELLOW DISPLAY");break;
		}
	}
}
public class Ex04 {
	public void main(String[] args) {
		Head hmd=new Head();
		hmd.putOn();
		hmd.putOff();
		hmd.changeSkin(Skinnable.Yellow);
		
		Wearable w=hmd;
		w.putOn();
		w.putOff();
		
		Skinnable s=hmd;
		s.changeSkin(Skinnable.Black);
		
		hmd.putSkin();
	}
}
