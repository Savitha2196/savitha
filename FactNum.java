import java.util.Scanner;


public class FactNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		int a=r.nextInt();
		int b=1;
		do
		{
			b=b*a;
			--a;
		}while(a>0);
		System.out.println(b);
	}

}
