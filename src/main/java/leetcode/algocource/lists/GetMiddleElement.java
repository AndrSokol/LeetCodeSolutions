package leetcode.algocource.lists;

import leetcode.solutions.easy.lists.ListNode;

import java.util.List;

public class GetMiddleElement {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        int res = findMiddleElement(listNode1);
        System.out.println(res);
    }

    private static int findMiddleElement(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
    }

    // Brute force
    private static int findMiddleElement1(ListNode head) {
        int length = 0;

        ListNode curr = head;

        while(curr != null) {
            length++;
            curr = curr.next;
        }

        curr = head;

        for (int i = 0; i < length / 2; i++) {
            curr = curr.next;
        }

        return curr.val;
    }
}
