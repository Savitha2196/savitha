public class CharReverseEx {

	public static void main(String[] args) {
		 
		String a="java";
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i=i+2)
		{
			char t=c[i];
			c[i]=c[i+1];
			c[i+1]=t;
		}
		for(int j=0;j<c.length;j++)
		{
			System.out.println(c[j]);
		}
		
	}

}
