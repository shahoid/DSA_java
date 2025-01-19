public class LinkList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data; // Fix: Initialize the current node's data
            // this.next = null; // Optional: Explicitly set next to null
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        a.next = b;
        System.out.println(a.data); // Output: 3
        System.out.println(a.next.data); // Output: 4
    }
}

