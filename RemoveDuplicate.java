import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate
{
	public String remove(String inputString)
	{
	String result = "";
	Set<String> inputSet= new LinkedHashSet<String>(); 
	for(int i=0;i<inputString.length();i++)
	{
	inputSet.add(String.valueOf(inputString.charAt(i)));
	}
	for(String a: inputSet)
	{
	result += a;
	}
	return result;
	}
	public static void main(String java2carrer[])
	{
	RemoveDuplicate rd=new RemoveDuplicate();
	System.out.println(rd.remove("savitha"));
	}
	}
