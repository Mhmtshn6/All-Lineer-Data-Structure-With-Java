class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Add Nodes to Linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        // Print All Nodes
        System.out.println("Nodes in the Linked List:");
        linkedList.printAllNodes();

        // Remove a node from Linked list
        linkedList.remove(3);

        //After the remove a node from linked list
        System.out.println("Düğüm çıkarıldıktan sonra bağlı listedeki düğümler:");
        linkedList.printAllNodes();
    }
}
public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Add Nodes to Linked list
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Remove a node from Linked list
    public void remove(int value) {
        if (head == null) return;

        if (head.value == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Print All Nodes
    public void printAllNodes() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
class Node
{
    int value; // Value stored in the node
    Node next; // Reference to the next node in the list

    Node (int value) //Constructor that initializes the node with the specified value
    {
        this.value=value;
        this.next=null;
    }
}
