package BagsStacksQueues;

import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] it;
	private int size; 
	    public RandomizedQueue() {
        	 this.size = 0;
        	 it = (Item[]) new Object[1];
         }
	    public boolean isEmpty() {
	    	return size == 0;
	    }
	    public int size() {
	    	return this.size;
	    }
	    public  void resize(int capacity) {
	    	Item[] copy = (Item[])new Object[capacity];
	    	for(int i=0;i<it.length;i++) copy[i] = it[i];
	    	it = copy;
	    }
	    public void enqueue(Item item) {
	    	if(item == null) throw new NullPointerException();
	    	it[size++]=item;
	    	if(size == it.length) resize(it.length*2);
	    }
	    public Item dequeue() {
	    	if(isEmpty())throw new NullPointerException();
	    	int r = (int)(Math.random()*size);
	    	Item item = it[r];
	    	it[r] = it[size-1];
	    	it[size--]=null;
	    	if(size > 0 && size < it.length/4) resize(it.length/2);
	    	return item;
	    }
	    public Item sample() {
	    	if(isEmpty()) throw new NullPointerException();
	    	int r =(int)(Math.random()*size);
	    	return it[r];
	    }
	    public Iterator<Item> iterator(){
	    	return new RandomIterator();
	    }
	    public class RandomIterator implements Iterator<Item>{
	    	int i = 0;
	    	public boolean hasNext() {
	    		return (i < size()); 
	    	}
	    	public Item next() {
	    		return it[i++];
	    	}
	    }
	    public static void main(String[] args) {
	    	RandomizedQueue<Integer> R = new RandomizedQueue<>();
	    	R.enqueue(1);
	    	R.enqueue(2);
	    	R.enqueue(3);
	    	System.out.println(R.dequeue());
	    	System.out.println(R.sample());
	        Iterator<Integer> i = R.iterator();
	        while(i.hasNext()) {
	        	System.out.print(i.next());
	        }
	    }
}
