package BagsStacksQueues;
import java.util.*;
public class ArrayStackGeneric<Item> implements Iterable<Item>{
      private Item[] it;
      private int N = 0 ;
      public ArrayStackGeneric(int capacity){
    	   it =(Item[])new Object[capacity];
      }
      public boolean isEmpty() {
    	  return N == 0 ; 
      }
      public void push(Item item) {
    	  it[N++] = item;
      }
      public Item pop() {
    	  return it[--N];
      }
      public Iterator<Item> iterator(){
    	  return new ReverseIterator();
      }
      public class ReverseIterator implements Iterator<Item>{
    	  private int i = N ;
    	  public boolean hasNext() {
    		  return i > 0;
    	  }
    	  public Item next() {
    		  return it[--i];
    	  }
      }
}
