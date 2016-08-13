public class RemoveNumEx {
public static void main(String[] args) {
		int[] a=new int[]{1,2,3,1,4};
		int b=1;
		int flag=1;
		int[]c=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<c.length;j++)
				{
					if(i!=j)
					{
						if(a[i]!=b)
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
					System.out.println(a[i]);
				}
	}
}
}
