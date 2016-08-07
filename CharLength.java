public class CharLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("wipro technologies");
		StringBuffer sb1=new StringBuffer("");
		sb=sb.reverse();
		String s=new String(sb);
		String[] b=s.split(" ");
		
	int c=0,s1=0;
		for(int i=0;i<b.length;i++)
		{
			c=b[i].length();
			sb1.append(c);
		}
		String m=new String(sb1);
		int m1=Integer.parseInt(m);
		System.out.println(m1);
	}
}
