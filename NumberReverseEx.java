import java.util.Scanner;

public class NumberReverseEx {

	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in);
		System.out.println("enter the number :");
		String a=r.next();
		System.out.println("enetr the value :");
		int d=r.nextInt();
		String b=a.substring(0,d);
		String c=a.substring(d,a.length());
		System.out.println(c+""+b);
		
	}

}
