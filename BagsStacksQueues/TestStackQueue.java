package BagsStacksQueues;

public class TestStackQueue{
	public static void main(String[] args) {
		QueueStack<Integer> q = new QueueStack<>();
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(4);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}
