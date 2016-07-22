import java.util.Scanner;


public class Holiday {

	String r="sunday";
	public boolean day(String Workingday)
	{
		if(Workingday.equals(r))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String Workingday=s.next();
		Holiday h=new Holiday();
		h.day(Workingday);
		
	}

}
