package dataStructures.stack;

class Queue{
	private int maxSize;
	private int front;
	private int rear;
	private int [] queueArr;
	private int nElems;
	
	Queue(int s){
		maxSize =s;
		queueArr = new int[maxSize];
		front=0;
		rear = -1;
		nElems =0;
	}
	
	public void insert(int i) {
		if(rear == maxSize-1) {
			rear=0;
		}
		queueArr[++rear] = i;
		nElems++;
	}
	
	public int remove() {
		int temp = queueArr[front++];
		if(front == maxSize) {
			front = -1;
		}
		nElems--;
		return temp;
	}
	
	public boolean isEmpty() {
		return nElems ==0;
	}
	
	public boolean isFull() {
		return nElems == maxSize-1;
	}
	
}
public class QueueApp {
	public static void main(String[] args) {
		 Queue q1 = new Queue(5);
		 q1.insert(0);
		 q1.insert(1);
		 q1.insert(2);
		 q1.insert(3);
		 q1.insert(4);
		 
		 while(! q1.isEmpty()) {
			 System.out.println(q1.remove());
		 }
	}
}
