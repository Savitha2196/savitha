public class TargetArrayEx {

	public static void main(String[] args) {
		int[] a={3,5,6,2,3,7};
		int target=8;
		for(int i=0;i<a.length+2;i++)
		{
			if((a[i]+a[i+1])==target)
			{
				System.out.println(a[i]+" "+a[i+1]+" = "+(a[i]+a[i+1]));
			}
			else
			{
				continue;
			}
		}
	}

}
