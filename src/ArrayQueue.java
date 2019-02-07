public class ArrayQueue implements Queue{
	// Implementation of Queue interface using an array
	public static final int CAPACITY = 1024;
			// default capacity of Queue
	public int N;		// maximum capacity of the Queue
	public Object S[];		// S holds the elements of the Queue
	public int f = -1; 	// the front element of the Queue
	public int r = 0; 	// the rear element of the Queue
	public ArrayQueue(){		// initialize the Queue with the default capacity
		this(CAPACITY);
	}
	public ArrayQueue(int cap){		// initialize the Queue with given capacity
		N = cap;
		S = new Object[N];
	}
	public int size(){	
		if (f == -1 && r == 0)			// returns the current Queue size
			return 0;
		return (N - f + r) % N;
	}
	public boolean isEmpty(){		// returns true if the Queue is empty
		return (size() == 0);
	}
	public void enqueue(Object obj) throws QueueFullException{		// enqueue a new element on the Queue
		if (size() == 0)
			f = 0;
		
		if (size() == N - 1)
			throw new QueueFullException("Queue full");
		S[r] = obj;
		r = (r + 1) % N;	

		
	}
	public Object dequeue() throws QueueEmptyException{		// dequeue the Queue element
		Object elem;
		if (isEmpty())
			throw new QueueEmptyException("Queue is empty");
		elem = S[f];
		S[f] = null;		// dereference S[r]
		f = (f + 1) % N;
		return elem;
	}
	public Object front() throws QueueEmptyException{
		return S[f];
	}

}