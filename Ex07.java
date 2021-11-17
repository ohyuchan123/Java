package Chap07;
abstract class Human{
	public abstract void say();
	public abstract void sleep();
}
class Yuchan extends Human{
	public void say() {
		System.out.println("자바 추상");
	}
	public void sleep() {
		System.out.println("나는 12시에 잠을 잔다");
	}
}
public class Ex07 {
	public static void main(String[] args) {
		Yuchan yu = new Yuchan();
		yu.say();
		yu.sleep();
	}
}
