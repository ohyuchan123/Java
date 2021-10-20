package Chap07;
abstract class Human{

	public abstract void say();
	public abstract void sleep();
	
}
class MinJun extends Human{
	public void say() {
		System.out.println("¡§πŒ¿Ã πŸ∫∏");
	}
	public void sleep() {
		System.out.println("πŒ¡ÿ¿Ã √µ¿Á");
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
