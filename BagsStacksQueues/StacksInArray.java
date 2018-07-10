package BagsStacksQueues;

public class StacksInArray {
   private String[] str; 
   private int N = 0;
   public StacksInArray(int capacity) {
	   str = new String[capacity];
   }
   public void push(String s) {
	   str[N++] = s ; 
   }
  /* public String pop() {
	   return str[--N];
   }*/
   public String pop()
   {
   String item = str[--N];
   str[N] = null;
   return item;
   }
}
