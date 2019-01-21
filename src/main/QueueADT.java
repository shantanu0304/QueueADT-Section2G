package main;

public class QueueADT
{

	int[] queue = new int[5];
	int front = -1;
	int rear = -1;
	int size = queue.length;

	void enqueue(int value)
	{
		if(!isFull())
		{
			front=0;
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
			int i;
			deleted = queue[0];
			for (i = 0; i <queue.length-1 ; i++) {
				queue[i]=queue[i+1];
			}
			queue[i]=0;
			rear--;
			if(queue[0]==0){
				rear=-1;
				front=-1;
			}
		}
		else{
			System.out.println("UnderFlow!!!");
		}


		return deleted;
	}

	int peek()
	{
		int item = queue[rear];
		return item;
	}

	int size()
	{
		int size = 0;
		size = rear + 1;
		return size;
	}

	boolean isEmpty()
	{
		if((front == -1) && (rear == -1)) {
			return(true);
		}
		else{
			return(false);
		}
	}

	boolean isFull()
	{
		if(rear == queue.length-1) {
			return(true);
		}
		else{
			return(false);
		}
	}

	void show(){
		for (int i = 0; i <queue.length ; i++) {
			System.out.print(queue[i]+" ");
		}
	}

}
