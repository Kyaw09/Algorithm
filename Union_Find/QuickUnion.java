package Union_Find;

public class QuickUnion {
    private int[] id ; 
    public QuickUnion(int N ) {
        id = new int[N] ; 
        for(int i = 0 ; i < id.length ; i++) id[i] = i ; 
    }
	private int root(int j) {
    	while(id[j] != j)  j = id[j] ; 
    	return j ; 
    }
    public void union(int p , int q ) {
           id[root(p)] = root(q) ; 
    }
    public boolean connected(int p , int q ) {
    	return root(p) == root(q) ; 
    }
}
