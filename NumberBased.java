public class NumberBased {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345,s=0;
		while(n>0)
		{
			int a=n%10;
			n=n/10;
			int b=n%10;
			s=(int) (s+Math.pow(b,a));
		}
		System.out.println(s);
	}
}
