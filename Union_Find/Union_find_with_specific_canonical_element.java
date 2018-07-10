package Union_Find;
import java.util.*; 
public class Union_find_with_specific_canonical_element {
	 private int[] id , az  ; 
	 static Scanner input = new Scanner(System.in) ; 
    public Union_find_with_specific_canonical_element(int N) {
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
     public int find(int i) {
    	// System.out.println(root(i));
    	 int[] b = new int[az[root(i)]] ;
    	// System.out.println(az[root(i)]);
    	 int iii = 0 , max = 0 ;  
    	 for(int ii = 0 ; ii < id.length ; ii++ ) {
    		   if( id[ii] == root(i)) { b[iii] = ii ; 
    		   if(iii == 0) max = b[iii] ; 
    		   else if( b[iii] > max) max = b[iii] ; 
    		   iii++ ; 
    		   }
    	 }
    	 return max ; //System.out.println("The largest number in component containing q is " + max ) ; 
     }
     public static void main(String[] args) {
 	    System.out.print("Enter number of element ");
 	    int N = input.nextInt() ; 
 	    Union_find_with_specific_canonical_element U = new Union_find_with_specific_canonical_element(N) ; 
 	    int p , q;
 	    long StartTime = System.currentTimeMillis() ; 
 	    do {
 	    	  System.out.print("Enter two elements or you want to end enter -1 and one integer to find largest number in component containing this integer ");
 	    	   p = input.nextInt(); 
 	    	   q = input.nextInt();
 	    	   if(p == -1) { System.out.println("The largest number in component containing q is "+U.find(q));  long EndTime = System.currentTimeMillis() ; 
 	   	    long testTime = EndTime - StartTime  ; 
 		    System.out.println(testTime);System.exit(1);} 
 	    	   if(U.connected(p, q)) System.out.println("Two numbers are connected ");
 	    	   else { U.union(p, q); System.out.println(p + "   " + q);}
 	    }while(p != -1); 
    }
}
