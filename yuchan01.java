import java.util.Scanner;
public class yuchan01 {
    public static void main(String[] args)
    {
        //시작단과 마지막 단을 입력하면
        //
        //그 구간의 구구단을 출력하는 프로그램을 작성하시오.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        for(int i=n ; i<=num ;i++)
        {
            for(int j=1 ;j<10 ;j++)
            {
                System.out.printf("%d * %d = %d ",i,j,i*j);
                System.out.println();
            }
        }
    }
}
