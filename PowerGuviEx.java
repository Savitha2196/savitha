package coding;
public class PowerGuviEx {
	public static int output;
	public static void main(String[] args) {
		PowerGuviEx p=new PowerGuviEx();
		p.nextValue(1234);
		System.out.println(output);
	}
	public int powerGuviEx(int a,int b){
		int res = 1;
		for (int i = 0; i < b; i++) {
		   res *= a;
		}
		return res;
	}
	public int nextValue(int n){
		int p=n,r, q,s=0,s1=0,rev=0,count=0;
		while(p!=0){
			s1=p%10;
			p=p/10;
			rev=rev*10+s1;
			count++;
		}
        int a=rev;
		while(a!=0){
			p=a%10;
			a=a/10;
			if(count==1){
			r=rev%10;
			}
			else{
			r=a%10;
			}
			s=s+powerGuviEx(p,r);
			count--;
		}
		output=s;
		return output;
	}
}
