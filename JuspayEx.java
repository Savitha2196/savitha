public class JuspayEx {
  public static void main(String[] args) {
		String a="helloworld",b="";
		char c;
		for(int i=3;i<a.length();i=i+2)
		{
			c=a.charAt(i);
			b=b+c;
		}
		System.out.println(a.substring(0,2)+b);
	}
}
