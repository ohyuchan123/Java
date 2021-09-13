package Chap04;

//정적 멤버

class Circle2{
	double raduis;
	static int numOfCircles=0;
	int numCircles=0;
	
	//생성자
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
		
		System.out.println("원의 개수 "+Circle2.numOfCircles);
		System.out.println("원의 개수 "+myCircle.numCircles);
		System.out.println("원의 개수 "+yourCircle.numCircles);
	}
}
