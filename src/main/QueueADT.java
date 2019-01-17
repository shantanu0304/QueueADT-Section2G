package main;

public class QueueADT
{

	int[] queue = new int[10];
	int front = -1;
	int rear = -1;
	int size = queue.length;

	void enqueue(int value)
	{
		if(!isFull())
		{
			rear++;
			queue[rear] = value;
		}
		else
		{
			System.out.println("Overflow");
		}
	}

	int dequeue()
	{
		int deleted = 0;

		if(!isEmpty())
		{
			front++;

		}


		return deleted;
	}

	int peek()
	{
		int item = 0;

		return item;
	}

	int size()
	{
		int size = 0;

		return size;
	}

	boolean isEmpty()
	{
		return false;
	}

	boolean isFull()
	{
		return false;
	}

}
