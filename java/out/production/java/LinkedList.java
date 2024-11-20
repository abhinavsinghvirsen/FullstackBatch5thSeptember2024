package out.production.java;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

public class LinkedList {
    public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    LinkedList list = new LinkedList();
    ListNode reversedHead = list.reverseList(head);


    ListNode current = reversedHead;
    while (current != null) {
        System.out.print(current.value + " ");
        current = current.next;
    }
}

    // Method to reverse the linked list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; // Save the next node
            current.next = prev;          // Reverse the link
            prev = current;               // Move prev up
            current = next;               // Move to the next node
        }

        return prev; // New head of the reversed list
    }
}
