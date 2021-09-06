package Chap02;

public class Ex_11 {
	public static int sum(int n1,int n2) {
		int sum=0;
		for(int i=n1 ;i<=n2 ;i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static double sum1(double nd1,double nd2)
	{
		double sum1=0;
		for(double i=nd1;i<=nd2 ;i++)
		{
			sum1+=i;
		}
		return sum1;
	}
	public static double sum2(double nd1,double n1)
	{
		double sum2=0;
		for(double i=nd1;i<=n1 ;i+=0.5)
		{
			sum2+=i;
		}
		return sum2;
	}
	public static void main(String[] args) {
		int n1=10,n2=100;
		double nd1=5.5,nd2=10.5;
		System.out.println(sum(n1,n2));
		System.out.println(sum1(nd1,nd2));
		System.out.println(sum2(nd1,n1));
	}

}
