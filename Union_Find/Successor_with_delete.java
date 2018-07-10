package Union_Find;
import java.util.*;
public class Successor_with_delete {
	 private int[] id , az  ; 
	 static Scanner input = new Scanner(System.in) ; 
	  static Set<Integer> m = new TreeSet<>() ; 
     public Successor_with_delete(int N){
    	 id = new int[N]  ; 
    	 az = new int[N] ; 
    	 for(int i = 0 ; i < id.length ; i++) {id[i] = i ; az[i] = 1 ; }
     }
     public int root(int i ) {
    	 while( i != id[i] ) { id[i] = id[id[i]] ; i = id[i] ; }
    	 return i ; 
     }
     public boolean connected(int p , int q) { return root(p) == root(q) ;} 
     public void union(int p , int q) {
    	 int i = root(p) ;
    	 int j = root(q) ; 
    	 if(i == j ) return ; 
    	 else if(az[i] < az[j]) {id[i] = j ; az[j] += az[i] ; }
    	 else {id[j] = i ; az[i] += az[j] ; }
     }
     public void  S(int i) {
     	 for(int ii = 0 ; ii < id.length ; ii++ ) {
     		   if( id[ii] == root(i)) { m.add(ii) ; 
     		   }
     	 }
     }
     public void remove(int x) {
    	 m.remove(x) ; 
    	 System.out.println(m);
     }
     public void successor(int x) {
    	 System.out.println(((TreeSet<Integer>) m).ceiling(x)) ; 
     }
     public static void main(String[] args) {
  	    System.out.print("Enter number of element ");
  	    int N = input.nextInt() ; 
  	    Successor_with_delete s = new Successor_with_delete( N) ; 
  	    int p , q;
  	    long StartTime = System.currentTimeMillis() ; 
  	    do {
  	    	  System.out.print("Enter two elements or you want to end enter -1 and one integer to find largest number in component containing this integer ");
  	    	   p = input.nextInt(); 
  	    	   q = input.nextInt();
  	    	   if(p == -1) { 
  	    		   System.out.println(" Enter element to remove from component or enter -1 to skip ");
  	    		   int x = input.nextInt() ; 
  	    		   if( x != -1 ) {
  	    			   s.S(x);
  	    			   s.remove(x);
  	    			   s.successor(x);
  	    		   }
  	    		   long EndTime = System.currentTimeMillis() ; 
  	   	    long testTime = EndTime - StartTime  ; 
  		    System.out.println(testTime);System.exit(1);} 
  	    	   if(s.connected(p, q)) System.out.println("Two numbers are connected ");
  	    	   else { s.union(p, q); System.out.println(p + "   " + q);}
  	    }while(p != -1); 
     }
}