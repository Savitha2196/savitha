import java.util.Arrays;
public class FirstTwoDigits {
public static void main(String[] args) {
		int a=15376;
		String d=String.valueOf(a);
		int b=String.valueOf(a).length();
		int[] c=new int[b];
		for(int i=0;i<b;i++)
		{
			c[i]=d.charAt(i)-'0';
		}
		Arrays.sort(c);
		System.out.println(c[0]+""+c[1]);
	}
}
