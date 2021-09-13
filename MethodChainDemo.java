package Chap04;

class Person{
	String name;
	int age;
	
	public Person SetName(String name) {
		this.name=name;
		return this;
	}
	public Person SetAge(int age)
	{
		this.age=age;
		return this;
	}
	public void print()
	{
		System.out.println("�ȳ� ! ���� "+name+"�̰�, ���̴� "+age+"�� �̾�");
	}
}
public class MethodChainDemo {
	public static void main(String[] args) {
		Person pr=new Person();
//		pr.SetName("������");
//		pr.SetAge(17);
//		pr.print();
		
		pr.SetName("������").SetAge(17).print();
	}
}
