import java.util.Scanner;

public class PrimeLimitEx {

	public static void main(String[] args) {
		
		int flag = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first limit ");
		int a=s.nextInt();
		System.out.println("enter the second limit ");
		int b=s.nextInt();
		for(int i=a;i<=b;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = 0;
					break;
				}
				else
				{
					flag=1;
				}
				
			}
			if(flag==1)
			{
				System.out.println(i);
			}

		}
		
	}

}
