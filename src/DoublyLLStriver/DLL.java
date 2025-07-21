package DoublyLLStriver;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class DLL {
    static Node convert2Dll(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.back = prev;
            prev = prev.next;
        }
        return head;
    }

    static Node deleteHead(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        head = head.next;
        head.back = null;
        temp.next = null;
        return head;
    }

    static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node tail = temp.back;
        tail.next = null;
        temp.back = null;
        return head;
    }

    static Node removekthElement(Node head, int k) {
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            head = front;
            head.back = null;
            temp.next = null;
            return head;
        } else if (front == null) {
            prev.next = null;
            temp.back = null;
            return head;
        }
        prev.next = front;
        front.back = prev;
        temp.back = null;
        temp.next = null;
        return head;
    }

    static Node insertBeforeHead(Node head, int val) {
        Node temp = head;
        if (head == null) {
            return new Node(val, null, null);
        }
        Node newNode = new Node(val, head, null);
        temp.back = newNode;
        return newNode;
    }

    static Node insertAfterHead(Node head, int val) {
        Node temp = head;
        Node newNode = new Node(val);
        Node front = temp.next.next;
        newNode.next = front;
        newNode.back = temp;
        temp.next = newNode;
        front.back = newNode;
        return head;
    }

    static Node insertBeforeTail(Node head, int val) {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node temp = tail.back;
        Node newNode = new Node(val, tail, temp);
        temp.next = newNode;
        tail.back = newNode;
        return head;
    }

    static Node insertAfterTail(Node head, int val) {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newTail = new Node(val, null, tail);
        tail.next = newTail;
        return head;
    }
    static Node insertbeforekthelement(Node head, int k, int val){
        Node temp = head;
        int cnt = 0;
        if(k == 1){
            Node newNode = new Node(val,temp,null);
            head = head.next;
            head.back = newNode;
            return newNode;
        }
        while(temp != null){
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val,temp,prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 4, 5, 74, 47};

        Node head = convert2Dll(arr);
//        print(head);
//        head = deleteHead(head);
//        System.out.println("After removing head of DLL:- ");
//        print(head);
//        System.out.println("After removing tail of DLL:- ");
//        head = deleteTail(head);
        print(head);

//        head = removekthElement(head, 1);

//        head = insertBeforeHead(head,999);
//        head = insertAfterHead(head, 999);
//        head = insertBeforeTail(head, 300);
//        head = insertAfterTail(head, 300);

        head = insertbeforekthelement(head, 5,69);
        print(head);



    }
}
