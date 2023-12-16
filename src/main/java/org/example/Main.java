package org.example;

import org.example.merge.ListNode;
import org.example.merge.UtilityListNode;

public class Main {
    public static void main(String[] args) {

        // valori 1,2,4,6
        ListNode l1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4,
                                new ListNode(6))));
        // 1,3,4,
        ListNode l2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        ListNode toPrint;
        toPrint = UtilityListNode.mergeTwoLists(l1, l2);

        UtilityListNode.addNodeAtLast(toPrint, 100);
        while (toPrint != null) {
            System.out.print(toPrint.getVal() + ",");
            toPrint = toPrint.getNext();
        }
    }
}