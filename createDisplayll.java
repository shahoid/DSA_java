public class createDisplayll{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static class LinkList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);

            if(head == null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
        }

        void Display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.Display();
        System.out.println();
        System.out.println("The size of the linklist is :");
        System.out.println(ll.size());
    }
}