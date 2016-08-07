import java.util.Set;
import java.util.TreeSet;

public class ArraySubset
{
  public static <T> boolean ASubset(Set<T> setA, Set<T> setB) {
    return setB.containsAll(setA);
  }
  public static void main(String args[]) {
    Set<Character> s1 = new TreeSet<Character>();
    Set<Character> s2 = new TreeSet<Character>();

    s1.add('1');
    s1.add('2');
    s1.add('3');
    s1.add('4');

    s2.add('1');
    s2.add('2');
    s2.add('3');
    s2.add('4');

    System.out.println("set1: " + s1);
    System.out.println("set2: " + s2);

    System.out.println("isSubset: " + ASubset(s1, s2));
  }
}
