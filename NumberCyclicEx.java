package coding;
public class NumberCyclicEx {
	public static void main(String[] args) {
		int num=1234;
		int c=0;
		int r=0;
		int num1=num;
		while(num1>0)
		{
			num1=num1/10;
			c++;	
		}
		int c1=1;
		for(int i=0;num>0&&c1<=c;i++)
		{ 
			int a=num%10;
			num=num/10;
			r+=(a*c1);
			c1++;
		 }
		System.out.println(r);	
	   }
	}
