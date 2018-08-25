package ds.queue;

public class Queue {

  private int maxSize;        //initializes the number of items in queue
  private long[] queueArray;  //slots to maintain the data
  private int front;          //index position of the front of the queue
  private int rear;           //index position of the back of the queue
  private int count;          //maintain the count of current items in the queue

  public Queue(int maxSize) {
    this.maxSize = maxSize;
    this.queueArray = new long[this.maxSize];
    this.front = 0;
    this.rear = -1;
    this.count = 0;
  }

  /**
   * Returns true if queue is empty
   */
  public boolean isEmpty() {
    return (this.count == 0);
  }

  /**
   * Returns true if queue is full
   */
  public boolean isFull() {
    return (this.count == this.maxSize);
  }

  /**
   * Inserts an item at the back of the queue`
   */
  public void insert(long item) {
    if (this.isFull()) {
      System.out
          .println("Cannot insert an item " + item + " to the queue. The queue is already full.");
      return;
    }
    this.rear++;
    this.queueArray[rear] = item;
    this.count++;
  }

  public long remove() {
    if (this.isEmpty()) {
      System.out.println("Cannot remove an item from the queue. The queue is empty.");
      return -1;
    }
    long item = this.queueArray[front];
    this.front++;
    if (this.front == this.maxSize) {
      this.front = 0;
    }
    this.count--;
    return item;
  }

  /**
   * Return the first item of the queue
   */
  public long peekFront() {
    return this.queueArray[this.front];
  }

  /**
   * Return the last item of the queue
   */
  public long peekRear() {
    return this.queueArray[this.rear];
  }

  /**
   * Prints the items that are currently in the queue
   */
  public void read() {
    System.out.print("[ ");
    for (int i = this.front; i <= this.rear; i++) {
      System.out.print(this.queueArray[i] + " ");
    }
    System.out.print("]");
  }
}
