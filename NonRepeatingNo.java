public class NonRepeatingNo {
public static void main(String[] args) {
		int flag=1;
		int[] a={1,3,4,5,3,4,2,1};
		int[] b=new int[a.length];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(i!=j)
				{
					if(a[i]!=a[j])
					{
						flag=1;
					}
					else
					{
						flag=0;
						break;
					}
				}
			}
			if(flag==1)
			{
				System.out.println(a[i]);}
				}}}
