package BagsStacksQueues;

public class ResizingArrayStackOfStrings {
    private String[] s;
    private int N = 0;
    public ResizingArrayStackOfStrings() {
    	s = new String[1];
    }
    public void push(String item) {
    	if(N == s.length) resize(s.length*2);
    	s[N++] = item ; 
    }
    public void resize(int capacity) {
    	String[] copy = new String[capacity];
    	for(int i= 0 ; i < s.length ; i++) copy[i] = s[i];
    	s = copy ;
    }
    public String pop() {
    	String str = s[--N] ;
    	s[N] = null ; 
    	if(N == s.length/4) resize(s.length/2);
    	return str ; 
    }
}
