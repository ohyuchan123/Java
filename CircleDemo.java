package Chap04;

//this. �� this()�� ���㼭

class Circle{
	double radius;
	String color;
	public Circle(double radius, String color) {
		this.radius=radius;
		this.color=color;
	}
	public Circle(double radius) {
		//this.radius=radius;
		//color="��Ʈ";
		this(radius,"��Ʈ");
	}
	public Circle(String color) {
//		radius=3.14;
//		this.color=color;
		this(6.6,color);
	}
	void print()
	{
		System.out.println(radius+" �������� ����"+color+"�� ��");
	}
}
public class CircleDemo {
	public static void main(String[] args) {
		Circle c1=new Circle(0, null);
		c1.radius=5.0;
		c1.color="����";
		c1.print();
		
		Circle c2=new Circle(10.0,"���");
		c2.print();
		
		Circle c3=new Circle(7.0);
		c3.print();
		
		Circle c4=new Circle("ȸ��");
//		c4.radius=6.6;
		c4.print();
		
	}
}
