import java.util.Scanner;


public class Leapex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		int a=r.nextInt();
		if(a%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}

}
