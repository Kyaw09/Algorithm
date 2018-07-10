package BagsStacksQueues;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdOut;

public class Deque1<Item> implements Iterable<Item> {
   private Node first, last;
   private int size;
   
   private class Node
   {
       Item item;
       Node next;
       Node prev;
   }
   
   public Deque1()
   {
       size = 0;
       first = null;
       last = null;
   }
   
   private class DequeIterator implements Iterator<Item>
   {
       private Node current = first;
       
       public boolean hasNext() { return current != null; }
       public void remove() { throw new java.lang.UnsupportedOperationException(); }
       public Item next()
       {
           if (!hasNext()) throw new java.util.NoSuchElementException();
           Item item = current.item;
           current = current.next;
           return item;
       }
   }
      
   public boolean isEmpty() { return size == 0; }
   
   public int size() { return size; }
   
   public void addFirst(Item item) 
   {
       if (item == null) throw new NullPointerException(); 
       Node oldfirst = first;
       first = new Node();
       first.item = item;
       first.next = oldfirst;
       first.prev = null;
       if (isEmpty()) last = first;
       else oldfirst.prev = first;
       size++;
   }
       
   public void addLast(Item item)
   {
       if (item == null) throw new java.lang.NullPointerException();
       Node oldlast = last;
       last = new Node();
       last.item = item;
       last.next = null;
       last.prev = oldlast;
       if (isEmpty()) first = last;
       else oldlast.next = last;
       size++;
   }
   
   public Item removeFirst()
   {
       if (isEmpty()) throw new java.util.NoSuchElementException();
       Item item = first.item;  
       first = first.next;
       size--;
       if (isEmpty()) last = first;
       else first.prev = null;
       return item;
   }
   
   public Item removeLast()
   {
       if (isEmpty()) throw new java.util.NoSuchElementException(); 
       Item item = last.item;
       last = last.prev;
       size--;
       if (isEmpty()) first = last;
       else last.next = null;
       return item;
   }
       
   public Iterator<Item> iterator() { return new DequeIterator(); }
   public static void main(String[] args) {
   	Deque1<Integer> D = new Deque1<>();
       D.addFirst(1);
       D.addLast(2);
       D.addLast(3);
       D.addLast(4);
       D.addFirst(0);
       D.removeFirst();
       D.removeLast();
       Iterator<Integer> i = D.iterator();
      while(i.hasNext()) {
   	   StdOut.println(i.next());
      }
   }
}
