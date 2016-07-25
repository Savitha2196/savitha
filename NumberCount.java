import java.util.Scanner;


public class NumberCount {

	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int c=a.nextInt();
		int count=0;
		while(c>0){
			c=c/10;
			count++;
		}
		System.out.println(count);
	}

}
