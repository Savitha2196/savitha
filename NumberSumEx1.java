package coding;
public class NumberSumEx1 {
	public static void main(String[] args) {
		{
		int n=1234;
		int s=0,a,b=0;
		while(n>0){
			a=n%10;
			a=a*a*a*a;
			s=s+a;
			n=n/10;
		}
		System.out.println(s);
			}
		}
	}
