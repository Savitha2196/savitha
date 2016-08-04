import java.util.Scanner;


public class ArrayExcep {

	
	public static void main(String[] args) {

		
		Scanner b=new Scanner(System.in);
		System.out.println("enter the size of array element : ");
		int size=b.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values : ");
		for(int i=0;i<size;i++)
		{
			a[i]=b.nextInt();
		}
		System.out.println("enter the index to findout the array element : ");
		int p=b.nextInt();
		
			System.out.println(a[p]);
		
		b.close();
	}

}
