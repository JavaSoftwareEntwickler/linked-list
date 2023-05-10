package org.example.merge;

public class MergeListNode {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode results = new ListNode(0);
        ListNode attuale = results;
        while (l1 != null && l2 != null) {

            if(l1.val <= l2.val){
                attuale.next = l1;
                l1 = l1.next;
            }else{
                attuale.next = l2;
                l2 = l2.next;
            }
            attuale = attuale.next;
            attuale.next = (l1 == null) ? l2 : l1 ;
        }
        return results.next;
    }
}
