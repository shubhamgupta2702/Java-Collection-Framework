package linkedlistinJava;


class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}


public class LL {

    static Node convert2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }

        return head;
    }

    static int LengthofLL(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    static boolean searchInLL(Node head,int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {52, 3, 4, 5,458,74,85};

        Node head = convert2LL(arr);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

        int Length = LengthofLL(head);
        System.out.println(Length);
        System.out.println(searchInLL(head,58));
    }
}
