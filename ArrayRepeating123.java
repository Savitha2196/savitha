package coding;

import java.util.Scanner;

public class ArrayRepeating123 {

	public static void main(String[] args) {
		
		int c=0;
		Scanner r=new Scanner(System.in);
		System.out.println("enter the size of ana array :");
		int a=r.nextInt();
		int[] b=new int[a];
		System.out.println("enter the array elements :");
		for(int i=0;i<a;i++)
		{
			
			b[i]=r.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			if(b[0]==b[i])
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
