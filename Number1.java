public class Number1 {
	static int sum=1;
	public void number(int num)
	{
		while(num>0)
		{
			int a=num%10;
			num=num/10;
			sum*=a;
		}
		System.out.println(sum);
	}
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int num=s.nextInt();
	    Number1 n=new Number1();
	    n.number(num);
	    System.out.println(num*sum);
  
}
}
