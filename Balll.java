package Chap06;


public class Balll extends Circle{
	private String color;
	public Balll(String color)
	{
		this.color=color;
	}
	public void findArea() {
		System.out.println(color+"���̴�");
	}
	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(��*������*������*������)�̴�");
	}
}
