import java.util.Scanner;


public class VowelsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		char a=r.next().charAt(0);
		switch(a)
		{
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("constant");
		}
	}

}
