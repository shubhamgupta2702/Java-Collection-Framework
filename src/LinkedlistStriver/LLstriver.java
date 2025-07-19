package LinkedlistStriver;

public class LLstriver {
    static class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }

        Node(int data2) {
            this.data = data2;
            this.next = null;
        }
    }

    static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node convert2LL(int[] arr) {
        Node head = new Node(arr[0]);
        if (head == null) return head;

        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }

    static Node deletehead(Node head) {
        Node temp = head;
        if (head == null || head.next == null) return null;
        Node newHead = head.next;
        return newHead;

    }

    static Node deletetail(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;

    }

    static Node deleteK(Node head, int k) {
        Node temp = head;
        Node prev = null;
        int cnt = 0;
        if (head == null) return null;
        if (k == 1) {
            head = head.next;
            return head;
        }
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    static Node deletebyVal(Node head, int val) {
        Node temp = head;
        if (head == null) return null;
        if (head.data == val) {
            head = head.next;
            return head;
        }
        Node prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    static Node insertatHead(Node head, int val) {
        Node temp = new Node(val);  // return new Node(val, head);
        temp.next = head;
        return temp;
    }

    static Node inseratTail(Node head, int val){
        Node temp = head;
        Node temp2 = new Node(val);
        if(head == null) return head;


        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = temp2;
        temp2.next = null;
        return head;
    }

    public static void main(String[] args) {

        int[] arr = {23, 21, 45, 65, 54, 74, 92, 43};
        Node head = convert2LL(arr);
        traverse(head);
//        Node newhead = deletehead(head);
//        System.out.println(newhead.data);

//        Node tailDelete = deletetail(newhead);
//        System.out.println(tailDelete.data);
//        Node afterdelete = deleteK(head, 1);
        //Node deleteValue = deletebyVal(head, 23);
        //traverse(deleteValue);

//        head = insertatHead(head, 69);

        head = inseratTail(head, 999);
        traverse(head);


    }
}