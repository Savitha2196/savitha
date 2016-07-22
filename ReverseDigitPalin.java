import java.util.Scanner;


public class ReverseDigitPalin {

	
	public static void main(String[] args) {
		int b,temp,n=0;
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		temp=a;
		while(a>0)
		{
			b=a%10;
			n=(n*10)+b;
			a=a/10;
		}
		if(n==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
