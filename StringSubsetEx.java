public class StringSubsetEx {
	public static void main(String[] args) {
		String a="programming";
		char c;
		for(int i=1;i<a.length();i++)
		{
			c=a.charAt(i);
			System.out.println(a.substring(0,1)+c);
		}
	}
}
