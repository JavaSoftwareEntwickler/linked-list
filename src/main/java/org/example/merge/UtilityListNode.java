package org.example.merge;

public class UtilityListNode {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode results = new ListNode(0);
        ListNode attuale = results;
        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                attuale.next = l1;
                l1 = l1.next;
            } else {
                attuale.next = l2;
                l2 = l2.next;
            }
            attuale = attuale.next;
            attuale.next = (l1 == null) ? l2 : l1;
        }
        return results.next;
    }

    public static ListNode addNodeAtLast(ListNode lista, int valToAdd) {
        ListNode result = lista;
        if (lista == null) {
            lista = new ListNode(valToAdd, null);
            return result;
        }
        while (lista.next != null) {
            lista = lista.next;
        }
        lista.next = new ListNode(valToAdd,null);
        return result;
    }
}
