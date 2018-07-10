package BagsStacksQueues;

public class QueueStack<Item> {
        java.util.Stack<Item> s = new java.util.Stack<Item>();
        java.util.Stack<Item> s1 = new java.util.Stack<Item>();
        public void enqueue(Item item) {
        	if(item == null) throw new java.lang.NullPointerException();
        	s.push(item);
        }
        public int size(){
        	return (s.size()+s1.size());
        }
        public boolean isEmpty() {
        	return (size() == 0);
        }
       public Item dequeue() {
        	if(isEmpty()) throw new NullPointerException();
        	if(s1.isEmpty()) {
        		while(!s.isEmpty()) {
        			s1.push(s.pop());
        		}
        	}
        	return s1.pop();
        }
}
