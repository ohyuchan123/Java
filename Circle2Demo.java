package Chap04;

//���� ���

class Circle2{
	double raduis;
	static int numOfCircles=0;
	int numCircles=0;
	
	//������
	public Circle2(double radius)
	{
		this.raduis=radius;
		numOfCircles++;
		numCircles++;
	}
}

public class Circle2Demo {
	public static void main(String[] agrs)
	{
		Circle2 myCircle=new Circle2(10.0);
		Circle2 yourCircle=new Circle2(5.0);
		
		System.out.println("���� ���� "+Circle2.numOfCircles);
		System.out.println("���� ���� "+myCircle.numCircles);
		System.out.println("���� ���� "+yourCircle.numCircles);
	}
}
