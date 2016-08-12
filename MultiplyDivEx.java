import java.util.Scanner;

public class MultiplyDivEx {

	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in);
		System.out.println("enter the number :");
		int a=r.nextInt();
		System.out.println("enter the divident :");
		int b=r.nextInt();
		int c=0;
		if(a==0)
		{
			System.out.println("remainder =0");
		}
		else if(b==0)
		{
			System.out.println("remainder = 0");
		}
		else
		{
			while(a>=b)
			{
				c=c+1;
				a=a-b;
			}
			System.out.println("quotient ="+c);
		}

	}

}
