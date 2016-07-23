import java.util.Scanner;


public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		String c=a.next();
		String d=a.next();
		if(c.equals(d))
		{
			System.out.println("the strings are equal");
		}
		else
		{
			System.out.println("the strings are not equal");
		}
	}

}
