public class SumPalindrome {

	public static void main(String[] args) {
		int s=0;
		int[] y={560,30,5};
		for(int num :y)
		{
			s=s+num;
		}
		int q=0, temp=s;
		while(s>0)
		{
			int b=s%10;
			q=(q*10)+b;
			s=s/10;
		}
		if(temp==q)
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+" is not a palindrome number");
		}
	}
}
