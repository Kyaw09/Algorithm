package ElementarySort;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Insertion;
public class Sort2 {
     public static void main(String[] args) {
    	  String[] s= In.readStrings(args[0]);
    	  Insertion.sort(s);
    	  for(int i = 0; i < s.length ; i++) {
    		  System.out.println(s[i]);
    	  }
     }
}
