package Chap02;

public class Ex_10 {
	public static int sum() {
		int sum=0;
		for(int i=1 ;i<=10 ;i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum());
	}
}
