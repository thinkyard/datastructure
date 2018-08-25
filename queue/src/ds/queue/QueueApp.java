package ds.queue;

public class QueueApp {

  /**
   * Entry point
   */
  public static void main(String[] args) {
    Queue queue = new Queue(5);
    queue.insert(10);
    queue.insert(20);
    queue.insert(30);
    queue.insert(40);
    queue.insert(50);
    queue.insert(60);
    queue.read();

    queue.remove();
    queue.remove();
    queue.read();
  }

}
