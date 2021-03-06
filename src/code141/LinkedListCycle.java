package code141;

import java.util.*;

import common.ListNode;

public class LinkedListCycle {

}


// 141. Linked List Cycle
// Time Complexity: O(n), Space Complexity: O(n)
// Other Solution: Using Two Pointer, you can solve with 0(1) Space Complexity
class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (set.contains(curr)) {
                return true;
            }
            set.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
