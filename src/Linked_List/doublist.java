package Linked_List;

class Node {
    int data;
    Node prev;
    Node next;
}

class Method1 {
    static Node head, tail;

    public static void insertbeg(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.prev = null;
        newNode.next = head;

        if (head == null) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            head = newNode;
        }
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class doublist {
    public static void main(String[] args) {
        Method1.insertbeg(10);
        Method1.insertbeg(20);
        Method1.insertbeg(30);

        Method1.display(); 
    }
}

