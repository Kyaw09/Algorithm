package BagsStacksQueues;
import java.util.*;
public class TestGenericArray {
    public static void main(String[] args) {
    	ArrayStackGeneric<Integer> a = new ArrayStackGeneric<>(15);
    	a.push(1);
    	a.push(2);
    	System.out.println(a.pop());
    	a.push(3);
    	a.push(4);
    	a.push(5);
    	Iterator<Integer> i = a.iterator();
    	while(i.hasNext()) {
    		System.out.println(i.next());
    	}
    }
}
