package Chap05;

public class ball extends Circle{
	private String color;
	public ball(String color)
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
