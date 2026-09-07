/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> h = new HashSet<>();
        ListNode t = head;
        while(t!=null)
        {
            if(h.contains(t))
            {
                return true;
            }
            h.add(t);
            t= t.next;
        
        }
        
        return false;
    }
}