import java.util.ArrayList;
import java.util.Collections;
public class ReverseFunEx {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		Collections.reverse(al);
		System.out.println("the reverse order is :"+al);
	}
}
