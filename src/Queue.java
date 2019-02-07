public interface Queue{
	// accessor methods
	public int size();
	public boolean isEmpty();
	public Object front() throws QueueEmptyException;

	// update methods
	public void enqueue(Object element);
	public Object dequeue() throws QueueEmptyException;
}