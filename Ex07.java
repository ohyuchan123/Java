package Chap07;
abstract class Human{
	public abstract void say();
	public abstract void sleep();
}
class Yuchan extends Human{
	public void say() {
		System.out.println("�ڹ� �߻�");
	}
	public void sleep() {
		System.out.println("���� 12�ÿ� ���� �ܴ�");
	}
}
public class Ex07 {
	public static void main(String[] args) {
		Yuchan yu = new Yuchan();
		yu.say();
		yu.sleep();
	}
}
