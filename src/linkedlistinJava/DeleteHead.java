package linkedlistinJava;


public class DeleteHead {

    static Node deleteHead(Node head){
        Node temp = head;
        head = head.next;
        return head;
    }
     static Node convert2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }

    public static void main(String[] args) {
    int[] arr = {21,2,54,23,87,98,80};
    Node head = convert2LL(arr);


        Node newHead = deleteHead(head);
        System.out.println(newHead.data);

        Node temp = newHead;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();




    }
}
