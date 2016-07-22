import java.util.Scanner;


public class LagestNo {

	public static void main(String args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		int a=r.nextInt();
		int b=r.nextInt();
		int c=r.hashCode();
		if(a>b && a>c)
		{
			System.out.println(a+" is largest number");
		}
		else if(b>c && b>a)
		{
			System.out.println(b+" is largest number");
		}
		else
		{
			System.out.println(c+" is largest number");
		}
	}

}
