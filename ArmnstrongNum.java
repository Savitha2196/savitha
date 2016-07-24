import java.util.Scanner;


public class ArmnstrongNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int c=a.nextInt();
		int temp=0,d,e=0;
		temp=c;
		while(c>0)
		{
			d=c%10;
			c=c/10;
			e=e+(d*d*d);
		}
		if(temp==e)
		{
			System.out.println("it is an armstrong number");
		}
		else
			
		{
			System.out.println("it is not an armstrong number");
		}
	}

}
