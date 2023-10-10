package leetcode.algocource.lists;

import leetcode.solutions.easy.lists.ListNode;

import java.util.ArrayList;

public class ReturnKthElementFromTheEnd {
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

        int k = 2;

        ListNode res = returnKthFromTheEnd(listNode1, k);
        System.out.println(res.val);
    }

    private static ListNode returnKthFromTheEnd(ListNode head, int k) {
        ArrayList<ListNode> listNodes = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            listNodes.add(curr);
            curr = curr.next;
        }

        return listNodes.get(listNodes.size() - k - 1);
    }


}
