package Chap06;

public class ColoredCircle extends Circle1{
	String color;
	public ColoredCircle(int radius, String color) {
//		this.color=color;
		super(radius);
		this.radius=radius;
	}
	void show() {
		System.out.print("�������� "+radius+"��"+color+" ���̴�.");
	}
}
