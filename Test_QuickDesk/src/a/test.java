package a;

public class test {
	
	public static void main (String [] args) {
		
		//Test Queue class
		System.out.println("-----------------------------------");
		System.out.println("QUEUE");
		System.out.println("-----------------------------------");
		QUEUE q = new QUEUE (5);
		
		String [] arrQ = q.getQueue();
		
		q.enqueue("Sushi");
		q.enqueue("Xuan");
		q.enqueue("Happy");
		q.enqueue("Safe");
		q.enqueue("Healthy");
		
		//Print all items
		for(int i = q.getFront() ; i <  q.getRear(); i++) {
			System.out.println(arrQ[i]);
		}
		
		//Prompt "Queue is full!" 
		q.enqueue("Maxson");
		
		//Show number of items
		System.out.println("Number of items: " + q.size());
		
		//Show Removed Item
		System.out.println("Item removed: " + q.dequeue());
		
		for(int i = q.getFront() ; i <  q.getRear(); i++) {
			System.out.println(arrQ[i]);
		}
		System.out.println("Number of items: " + q.size());
		
		
		//Test Stack Class
		System.out.println("-----------------------------------");
		System.out.println("STACK");
		System.out.println("-----------------------------------");
		STACK s = new STACK (5);
		
		String [] arrS = s.getQueue();
		
		s.enqueue("Milk");
		s.enqueue("MLEM");
		s.enqueue("Lost");
		s.enqueue("Gone");
		s.enqueue("Depressed");
		
		//Print all items
		for(int j = 0 ; j <  s.size(); j++) {
			System.out.println(arrS[j]);
		}
		
		//Prompt "Stack is full!" 
		s.enqueue("Ivory");
		
		//Show number of items
		System.out.println("Number of items: " + s.size());
		
		//Show Removed Item
		System.out.println("Item removed: " + s.dequeue());
		
		for(int j = 0 ; j <  s.size(); j++) {
			System.out.println(arrS[j]);
		}
		System.out.println("Number of items: " + s.size());
		
		
 	}
}
