package a;

public class STACK implements IQueuable{
	
	private int size;
	private String [] arr;
	private int top;
	private int rTop;
	
	public STACK (int s) {
		
		this.size = s;
		this.arr = new String [this.size];
		this.top = -1;
	}
 	@Override
	public String[] enqueue(String s) {
		// TODO Auto-generated method stub
 		if(!(this.size - 1 == this.top)) {
 			this.top++;
 			this.arr[this.top] = s;
 		}
 		else {
 			System.out.println("Stack is full!");
 		}
		return this.arr;
	}

	@Override
	public String dequeue() {
		// TODO Auto-generated method stub
		if(!(this.top == -1)) {
			this.rTop = this.top;
			this.top--;
		}
		else {
			System.out.println("Stack is empty!");
		}
		return this.arr[rTop];
	}

	@Override
	public String[] getQueue() {
		// TODO Auto-generated method stub
		return this.arr;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.top + 1;
	}
	
	
}
