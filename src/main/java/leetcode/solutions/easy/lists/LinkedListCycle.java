package leetcode.solutions.easy.lists;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedListCycle {
    //    https://leetcode.com/problems/linked-list-cycle/editorial/
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visitedNodesSet = new HashSet<>();

        ListNode curr = head;

        while (curr != null) {
            if (visitedNodesSet.contains(curr)) {
                return true;
            }
            visitedNodesSet.add(curr);
            curr = curr.next;
        }

        return false;
    }

    public boolean hasCycle1(ListNode head) {
        if (head == null) {
            return false;
        }

        Map<Integer, Integer> numsPosMap = new HashMap<>();

        ListNode curr = head;
        int num = curr.val;
        int nodePos = 0;

        while (curr != null) {
            if (numsPosMap.containsKey(num)) {
                if (curr.next != null){
                    Integer nextElementPos = numsPosMap.get(curr.next.val);
                    if (nextElementPos != null && nodePos - numsPosMap.get(num) + 1 == nextElementPos) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
            numsPosMap.put(num, nodePos);
            nodePos++;
            curr = curr.next;
            if (curr == null) {
                return false;
            }
            num = curr.val;
        }

        return true;
    }
}
