public class stack {
    int arr[],top,capacity;
    stack(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }
    void push(int item) {
        arr[++top] = item;
    }
    int pop() {
        if(top==-1) {
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }
    int peek() {
        if(top==-1) {
            System.out.println("Stack is empty");
        }
        return arr[top];
    }
    void isEmpty() {
        if(top==-1) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Stack is not Empty");
        }
    }
    void print() {
        for (int i = 0; i < size(); i++) {
            System.out.print(arr[i]+" ");
        }
    }
    int size() {
        return top + 1;
    }
    public static void main(String[] args) {
        stack s = new stack(6);
        s.push(10);
        s.push(11);
        s.push(23);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.print();
    }
}
