import java.util.Scanner;
public class CharacterCount {
public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=r.nextInt();
		int[] b=new int[a];
		for(int i=0;i<a;i++)
		{
			b[i]=r.nextInt();
		}
		char[] c=new char[b.length];
		for(int j=0;j<b.length;j++)
		{
			c[j]=(char) (b[j]+96);
			System.out.println(c[j]);
		}
	}
}
