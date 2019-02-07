public class TestQueue{
	public static void main(String[] args){
		ArrayQueue queue = new ArrayQueue(5);
		
		System.out.println("f is: " +  queue.f
                      + " r is: " + queue.r);
    	queue.enqueue(1);
    	
    	System.out.println("f is: " +  queue.f
                      + " r is: " + queue.r);
    
    	queue.enqueue(2);
    	System.out.println("f is: " +  queue.f
                      + " r is: " + queue.r);
    
    	queue.enqueue(3);
    	System.out.println("f is: " +  queue.f
                      + " r is: " + queue.r);
    
    	queue.dequeue();
    	System.out.println("f is: " +  queue.f
                      + " r is: " + queue.r);
    	
    	queue.dequeue();
    	System.out.println("f is: " +  queue.f
                      + " r is: " + queue.r);
    	
    	queue.enqueue(4);
    	System.out.println("f is: " +  queue.f
                      + " r is: " + queue.r);
    	
    	queue.enqueue(5);
    	System.out.println("f is: " +  queue.f
                      + " r is: " + queue.r);
    	
    	queue.enqueue(6);
    	System.out.println("f is: " +  queue.f
                      + " r is: " + queue.r);
    

    	for (int i=0; i < queue.N; i++)
      		System.out.print(queue.S[i] + " ");
    	System.out.print("\n");


	}
}