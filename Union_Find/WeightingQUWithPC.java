package Union_Find;

public class WeightingQUWithPC {
     private int[] id , az  ; 
     public WeightingQUWithPC(int N) {
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
}
