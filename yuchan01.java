import java.util.Scanner;
public class yuchan01 {
    public static void main(String[] args)
    {
        //n이 입력되면 다음 삼각형을 출력하시오.
        //
        //예) n = 4
        //
        //*
        //**
        //***
        //****
        //***
        //**
        //*
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1 ; i<=n*2 ;i++)
        {
            if(i<=n)
            {
                for(int j=1; j<=i ;j++)
                {
                    System.out.printf("*");
                }
                System.out.println();
            }

            else
            {
                for(int k=i ; k<n*2;k++)
                {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }
}
