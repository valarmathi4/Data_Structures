package Linked_List;

class Node1 {
    int data;
    Node1 prev;
    Node1 next;
}

class Method1 {
    static Node1 head, tail;

    public static void insertbeg(int data) {
        Node1 newNode = new Node1();
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
        Node1 temp = head;
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

