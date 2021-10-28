public class queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
  
    queue() {
      front = -1;
      rear = -1;
    }
    boolean isFull() {
      if (front == 0 && rear == SIZE - 1) {
        return true;
      }
      return false;
    }
    boolean isEmpty() {
      if (front == -1)
        return true;
      else
        return false;
    }
    void enqueue(int element) {
  
      if (isFull()) {
        System.out.println("queue is full");
      }
      else {
        if (front == -1) {
          front = 0;
        }
       rear++;
        items[rear] = element;
        System.out.println("Insert " + element);
      }
    }
    int dequeue() {
      int element;
      if (isEmpty()) {
        System.out.println("queue is empty");
        return (-1);
      }
      else {
        element = items[front];
        if (front >= rear) {
          front = -1;
          rear = -1;
        }
        else {
          front++;
        }
        System.out.println( element + " Deleted");
        return (element);
      }
    }
    void display() {
      int i;
      if (isEmpty()) {
        System.out.println("Empty queue");
      }
      else {
        // System.out.println("\nFront index-> " + front);
        System.out.println("Items -> ");
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");
        // System.out.println("\nRear index-> " + rear);
      }
    }
    public static void main(String[] args) {
      queue q = new queue();
      q.enqueue(6);
      q.display();
      q.dequeue();
      q.display();
    }
  }
