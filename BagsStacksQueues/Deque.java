package BagsStacksQueues;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Deque<Item>  implements Iterable<Item>{
	private Node first,Last;
    private int size = 0;
    static Scanner input = new Scanner(System.in);
    public class Node{
    	Item item;
    	Node next;
    	Node prev;
    }
	public Deque() {
		size = 0;
		first = null;
		Last = null;
    	}
       public boolean isEmpty() {
    	   return (size == 0);
       }
       public int size() {
    	   return size; 
       }
       public void addFirst(Item item) {
    	   if(item == null) throw new NullPointerException();
    	   Node OldFirst = first;
    	   first = new Node();
    	   first.item = item;
    	   first.next = OldFirst;
    	   first.prev = null;
    	   if(isEmpty()) {
    		   Last = first;
    	   }else {
    		  OldFirst.prev = first;
    	   }
    	   size++;
    }
    public void addLast(Item item) {
    	size++;
    	if(item == null) throw new NullPointerException();
    	Node OldLast = Last;
    	Last = new Node();
    	Last.item = item;
    	Last.next = null;
    	if(isEmpty()) {
    		first = Last;
    	}else {
    		Last.prev = OldLast;
    		OldLast.next = Last;
    	}
    }
    public Item removeFirst() {
    	if(isEmpty()) throw new NoSuchElementException();
    	Item item = first.item;
    	first = first.next;
    	size--;
    	if(isEmpty()) Last = first;
    	else first.prev = null;
    	return item;
    }
    public Item removeLast() {
    	if(isEmpty()) throw new NoSuchElementException();
    	Item item = Last.item;
        Last = Last.prev;
        size--;
        if(isEmpty()) first = Last;
        else Last.next = null;
        return item;
     }
    public Iterator<Item> iterator(){
    	return new ListIterator();
    }
    public class ListIterator implements Iterator<Item>{
       private Node current = first;
    	public boolean hasNext() {
    		return current != null;
    	}
    	public Item next() {
    		Item item = current.item;
    		current = current.next;
    		return item;
    	}
    }
    public static void main(String[] args) {
    	Deque<Integer> D = new Deque<>();
        D.addFirst(1);
        D.addLast(2);
        D.addLast(3);
        D.addLast(4);
        D.addFirst(0);
        D.removeFirst();
        D.removeLast();
        Iterator<Integer> i = D.iterator();
       while(i.hasNext()) {
    	   System.out.println(i.next());
       }
    }
}
