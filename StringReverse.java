public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("wipro technologies");
		StringBuffer sb1=new StringBuffer("");
		sb=sb.reverse();
		String s=new String(sb);
		String[] b=s.split(" ");
		System.out.println(sb);
	}
}
