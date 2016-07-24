import java.util.Scanner;


public class HcfEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
         int r;
          
         while(n2 != 0)
         {
             r = n1 % n2;
             n1 = n2;
             n2 = r;
         }
         System.out.print("GCD = "+n1);
	}

}
