package Chap07;
interface Dinosaur{
	public abstract void cry();
}
class Trax implements Dinosaur{
	public void cry() {
		System.out.println("²Ù¾î¾î¾û");
	}
	public void walk() {
		System.out.println("°È±â");
	}
}
class Ptera implements Dinosaur{
	public void cry() {
		System.out.println("³¢¿¡¿¡¿¢");
	}
	public void fly()
	{
		System.out.println("³¯±â");
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
