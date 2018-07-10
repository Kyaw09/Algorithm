package Union_Find;
import java.util.*; 
public class Quick_Find_1 {
           private   int[] id ; 
           static Scanner input = new Scanner(System.in); 
           public Quick_Find_1(int N) {
        	     id = new int[N]; 
        	     for(int i = 0 ; i < id.length ; i ++) id[i] = i;
           }
           public  boolean connected(int p , int q ) {
        	      return id[p] == id[q] ; 
           }
           public  void union(int p , int q) {
        	   int pid = id[p] ; 
        	   int qid = id[q] ; 
        	   for(int i = 0 ; i < id.length ;  i++) {
        	    	if(pid == id[i]) id[i] = qid ; 
        	    }
           }
}
