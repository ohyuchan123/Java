package Chap07;
interface Dinosaur{
	public abstract void cry();
}
class Trax implements Dinosaur{
	public void cry() {
		System.out.println("�پ���");
	}
	public void walk() {
		System.out.println("�ȱ�");
	}
}
class Ptera implements Dinosaur{
	public void cry() {
		System.out.println("��������");
	}
	public void fly()
	{
		System.out.println("����");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Trax t=new Trax();
		Ptera p=new Ptera();
		t.cry();
		t.walk();
		p.cry();
		p.fly();
	}
}
