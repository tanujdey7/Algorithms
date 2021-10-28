public class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node head;
    void add(int data) {
        Node toAdd = new Node(data);
        if(head == null) {
            head = toAdd;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }
    void print() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    void deleteNode(int position) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (position == 0) {
            head = temp.next;   
            return;
        }
        for (int i=1; i<position; i++) {
            temp = temp.next;
        }
        Node next = temp.next.next;
        temp.next = next; 
    }
    boolean isEmpty() {
        return head == null;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(12);
        ll.add(34);
        ll.deleteNode(2);
        ll.print();
    }
}
