package Chap06;


public class Balll extends Circle{
	private String color;
	public Balll(String color)
	{
		this.color=color;
	}
	public void findArea() {
		System.out.println(color+"공이다");
	}
	public void findVolume() {
		System.out.println("부피는 4/3*(π*반지름*반지름*반지름)이다");
	}
}
