package Chap07;
abstract class Human{

	public abstract void say();
	public abstract void sleep();
	
}
class MinJun extends Human{
	public void say() {
		System.out.println("������ �ٺ�");
	}
	public void sleep() {
		System.out.println("������ õ��");
	}
}
public class Ex01 {
	public static void main(String[] args)
	{
		MinJun minJun=new MinJun();
		minJun.say();
		minJun.sleep();
	}
}
