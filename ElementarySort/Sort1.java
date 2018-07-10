package ElementarySort;

import java.util.Arrays;
import edu.princeton.cs.algs4.StdRandom;

public class Sort1 {
    public static void main(String[] args) {
         int N = Integer.parseInt(args[0]);
         double[] a = new double[N];
         for(int i = 0 ; i < N ; i++) {
        	 a[i] = StdRandom.uniform();
         }
         Arrays.sort(a);
         for(int i = 0 ; i < a.length;i++) {
        	 System.out.println(a[i]);
         }
    }
}
