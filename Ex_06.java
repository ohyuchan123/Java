package Chap02;

public class Ex_06 {
	public static void main(String[] args)
	{
		alpha();
	}
	public static void alpha() {
		char a='a';
		do {
			System.out.print(a+" ");
			a=(char)(a+1);
		}while(a<='z');
	}
}
