import java.util.Arrays;
import java.util.Scanner;

public class LeastNumberEx
{
static int[] separate(String a)
{
int n[]=new int[a.length()];
for(int i=0;i<a.length();i++)
{
n[i]=a.charAt(i)-48;
}
return n;
}
public static void main(String[] args)
{
Scanner r=new Scanner(System.in);
String a=r.nextLine();
int n=r.nextInt();
int[] a1=separate(a);
Arrays.sort(a1);
int re=a1.length-n;
int s=0;
for(int i=0;i<re;i++)
{
	s=s*10+a1[i];
}
System.out.println(s);
}
}

   
