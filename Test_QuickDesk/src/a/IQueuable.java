package a;

public interface IQueuable {
	
	public String[] enqueue (String s);
	
	public String dequeue ();
	
	public String[] getQueue();
	
	public int size();
	
}
