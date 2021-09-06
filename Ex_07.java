package Chap02;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		/*int num=2;
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d * %d = %d",num,i,num*i);
			System.out.println();
		}*/
		/*for(int i=2;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}*/
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}

	}

}
