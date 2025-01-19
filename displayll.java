public class displayll {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(22);
        Node e = new Node(25);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node temp = a;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        // Node head = a;
        // Node newNode;
        // if(head == null){
        //     return;
        // } else{
        //     head.next = newNode;
        //     newNode.next= data;


        // }



        
    }
}
