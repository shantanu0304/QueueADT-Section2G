package main;

public class QueueMain
{
	public static void main(String[] args)
	{
		QueueADT queue1 = new QueueADT();

//		TODO add method call for enqueue
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(30);
		queue1.show();
		System.out.println(" ");
		queue1.enqueue(40);
		queue1.enqueue(50);
		queue1.enqueue(60);
		queue1.show();
		System.out.println(" ");

//		TODO add method call for dequeue
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		queue1.show();
		System.out.println(" ");
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		queue1.show();
		System.out.println(" ");
	}
}
