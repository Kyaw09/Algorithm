package BagsStacksQueues;
import java.util.*;
public class TestGeneric {
  public static void main(String[] args) {
	  Stack<Integer> s = new Stack<Integer>();
	  s.push(1);
	  s.push(2);
	  s.push(3);
	  s.push(4);
	  s.push(5);
	  System.out.println(s.pop());
	  Iterator<Integer> i = s.iterator();
	  while(i.hasNext()) {
		  Integer in = i.next();
		  System.out.println(in);
	  }
  }
}
