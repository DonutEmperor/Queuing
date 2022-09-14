package a;

public class QUEUE implements IQueuable{
	
	private int front , rear , capacity;
	private String[] arr;
	private String removed;
	private String[] newArr;
	
	public QUEUE(int s) {
		
		this.front = this.rear = 0;
		this.capacity = s;
		this.arr = new String [this.capacity];
	}
	
	
	@Override
	public String[] enqueue(String s) {
		// TODO Auto-generated method stub
		if (capacity == rear) {
			System.out.println("Queue is full!");
		}
		
		else {
			this.arr[rear] = s;
			rear++;
		}
		
		return this.arr;
	}

	@Override
	public String dequeue() {
		
		if (this.front == this.rear) {
			System.out.println("Queue is empty!");
		}
		else {
			removed = arr[front];
			
			for(int i = 0 ; i < this.rear-1; i++) {
				this.arr[i] = this.arr[i + 1];
			}
			
			if(this.rear < this.capacity) 
				this.arr[this.rear] = null;
			
			
			this.rear--;	
		}
		
		return this.removed;
	}

	@Override
	public String[] getQueue() {
		// TODO Auto-generated method stub
		if(this.front == this.rear) {
			System.out.println("Queue is empty!");
		}
		
		return this.arr;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return getRear();
	}
	
	public int getFront() {
		return this.front;
	}
	
	public int getRear() {
		return this.rear;
	}

}
