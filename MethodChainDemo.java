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
		System.out.println("안녕 ! 나는 "+name+"이고, 나이는 "+age+"살 이야");
	}
}
public class MethodChainDemo {
	public static void main(String[] args) {
		Person pr=new Person();
//		pr.SetName("손정민");
//		pr.SetAge(17);
//		pr.print();
		
		pr.SetName("손정민").SetAge(17).print();
	}
}
