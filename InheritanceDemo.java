package Chap06;

public class InheritanceDemo {

	public static void main(String[] args) {
		Circle c1=new Circle();
		Balll c2=new Balll("»¡°£»ö");
		
		System.out.println("¿ø : ");
		c1.findRaduis();
		c1.findArea();
		
		System.out.println("°ø : ");
		c2.findRaduis();
//		c2.findcolor();
		c2.findArea();
		
	}

}
