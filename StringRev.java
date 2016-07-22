import java.util.Scanner;


public class StringRev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next();
		int len;
		String r=" ",temp;
		temp=a;
		len=a.length();
		for (int i=len-1;i>=0;i--)
		{
			r=r+a.charAt(i);
		}
		System.out.println(r);
		
	}

}
