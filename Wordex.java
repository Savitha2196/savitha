import java.util.Scanner;


public class Wordex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner a=new Scanner(System.in);
		 c=a.next().charAt(0);
		 if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		 {
			 System.out.println(c+" is a character");
		 }
		 else 
		 {
			 System.out.println(c+ "is not a character");
		 }
	}

}
