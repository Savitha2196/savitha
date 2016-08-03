import java.util.Scanner;

public class WorkingDay {

	public static void main(String[] args) {
	
		boolean flag;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the day :");
		String s=r.next();
		if(s.equals("sunday"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}

}
