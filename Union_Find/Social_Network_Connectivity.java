package Union_Find;
import java.util.* ; 
public class Social_Network_Connectivity {
      private int[] id , az ; // first I declare two integer arrays id and az 
      // id for members record and az for number of members in tree  
      static Scanner input = new Scanner(System.in) ; 
      public Social_Network_Connectivity(int N) {// I create constructor with number of members 
    	  id = new int[N] ; 
    	  az = new int[N] ; 
    	  for(int i = 0 ; i < id.length ; i++ ) {
    		  id[i]  = i ; // I initialize members 
    		  az[i] = 1 ; 
    	  }
      }
      public int root(int i ) {// find root 
    	  while(i != id[i]) i = id[i] ; 
    	  return i ; 
      }
      public boolean isAllConnected(int count) { // I create this because I want to check whether all members are connected or not 
    	  return count == 1; 
      }
      public void union(int p , int q ) {
    	 int i = root(p) ; 
    	 int j = root(q) ; 
    	 if( i == j ) return ; 
    	 else if( az[i] < az[j]) {id[i] = j ; az[j] += az[i] ; }
    	 else {id[j] = i ; az[i] += az[j] ; }
      }
      public static void main(String[] args) {
    	  int N = input.nextInt() ; 
    	  int count = N ; 
    	  List<Date> M = new ArrayList<Date>() ;// I create ArrayList to record time when members are connected ; 
    	  Social_Network_Connectivity s = new Social_Network_Connectivity(N) ; 
    	 s.Allconnected(N, count,M);
      }
      public void Allconnected(int N,int count,List<Date> M) {
    	  int p = 0 ; // I want to connect with all members 
    	  for(int q = 1 ;  q < N  ; q++ ) {
              union(p, q);
              count-- ; 
              M.add(new Date()) ; 
    	  }
    	  if(isAllConnected(count)) { // If all members are connected , it will print earliest time \
       		Collections.sort(M);
       		 System.out.println(M.get(0).toString());// print earliest time 
       	 }
      }
}
