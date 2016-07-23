import java.util.Scanner;


public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int c=a.nextInt();
		int b;
		int s=0;
		int len=String.valueOf(c).length();
		while(c>0)
		{
			b=c%10;
			s=(int) (s+Math.pow(b,len));
			len--;
			c=c/10;
		}
		System.out.println(s);
	}

}
