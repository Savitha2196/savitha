import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
	        System.out.println("Enter the number : ");
	        int n = s.nextInt();

	        int a = 1;  
	        if(((~n) & 1) == 1)  
	        {  
	            System.out.println("The number is a power of two");  
	        }  
	        else  
	        {
	            System.out.println("The number is a  NOT A power of two");  
	        }

	}

}
