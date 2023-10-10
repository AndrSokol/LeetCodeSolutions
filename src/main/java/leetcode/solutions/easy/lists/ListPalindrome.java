package leetcode.solutions.easy.lists;

import java.util.ArrayList;
import java.util.List;

public class ListPalindrome {
    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(2);
//        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
//        listNode4.next = listNode5;

        boolean res = isPalindrome(listNode1);
        System.out.println(res);
    }


    private static boolean isPalindrome(ListNode head) {
        StringBuilder values = new StringBuilder();

        ListNode curr = head;
        ListNode prev = null;
        ListNode child = null;

        while (curr != null) {
            values.append(curr.val);
            child = curr.next;
            curr.next = prev;
            prev = curr;
            curr = child;
        }


        for (int i = 0; i < values.length(); i++) {
            if (values.charAt(i) != values.charAt(values.length() - i - 1))
            {
                return false;
            }
        }

        return true;
    }

    private static boolean isPalindrome2(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(arr.size() - i - 1)))
            {
                return false;
            }
        }

        return true;
    }

    private static boolean isPalindrome1(ListNode head) {
        StringBuilder values = new StringBuilder();

        ListNode curr = head;
        ListNode prev = null;
        ListNode child = null;

        while (curr != null) {
            values.append(curr.val);
            child = curr.next;
            curr.next = prev;
            prev = curr;
            curr = child;
        }

        String valuesStr = values.toString();
        String reversedValuesStr = values.reverse().toString();

        return valuesStr.equals(reversedValuesStr);
    }


}
