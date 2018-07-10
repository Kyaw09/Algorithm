package BagsStacksQueues;
import java.util.Scanner ; 
public class Stacks_Linked_list {
  static Scanner input = new Scanner(System.in) ; 
  private Node first = null ; 
  public class Node{
	  String item ; 
	  Node next ; 
  }
  public boolean isEmpty() {
	  return first == null ;
  }
  public void push(String str) {
	  Node oldfirst = first ; 
	  first = new Node() ; 
	  first.next = oldfirst ; 
	  first.item = str ; 
  }
  public String pop() {
	  String item = first.item ; 
	  first = first.next ; 
	  return item ;
  }
  public static void main(String[] args) {
	  Stacks_Linked_list s  = new Stacks_Linked_list();
	  System.out.print("Enter number of element to add in stack");
	  int N = input.nextInt() ;
	  int M = N ; 
	  while( N > 0) {
	  System.out.print("Enter String : ");
	  String str = input.next() ; 
	  s.push(str);
	  N-- ; 
	  }
	 while(M > 0) {
		 System.out.println(s.pop());
		 M-- ; 
	 }
	}
}