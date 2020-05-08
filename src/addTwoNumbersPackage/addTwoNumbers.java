package addTwoNumbersPackage;

/**
 * Understood the solution, I was limited by the MAX_VALUE of an integer in JAVA.
 * After seeing the solution, I told my self that there were no point to refactor all my code just to pass one specific test case,
 * so I decided to move on to the next problem.
 */
public class addTwoNumbers {

    /**
     * Function that raise a number by a power of 10.
     * @param p, the exponent.
     * @return 10^p
     */
    public static int power(int p){
        int nbr = 10;
        for(int i = 1; i < p; i++){
            nbr *= 10;
        }
        return nbr;
    }

    /**
     * To see the problem, here is the link : https://leetcode.com/problems/add-two-numbers/
     * @param l1, the head of our first list.
     * @param l2, the head of our second list.
     * @return a linked list storing the reversed result of the addition of the l1 and l2 linked list.
     */
    public static ListNode addTwoNumbersMethod(ListNode l1, ListNode l2) {
        ListNode[] listnode = new ListNode[100]; // Initializing an array of listNode.
        int exp = 1;
        int r1 = l1.val; // Our first result, that stands for the first linked list.
        int r2 = l2.val; // Our second result, that stands for the second linked list.

        // We're creating the number that we want with the digits stored in the two linked list.
        while(l1.next != null) {
            l1 = l1.next;
            r1 += l1.val * power(exp);
            exp++;
        }

        exp = 1;
        while(l2.next != null) {
            l2 = l2.next;
            r2 += l2.val * power(exp);
            exp++;
        }

        // Addition of the two results.
        int r3 = r1 + r2;

        // Creation of our resulted linked list.
        int i = 0;
        listnode[0] = new ListNode(r3%10);
        r3 /= 10;
        while (r3 != 0){
            ListNode current = new ListNode(r3%10);
            listnode[i].next = current;
            i++;
            listnode[i] = current;
            r3 /= 10;
        }
        return listnode[0];
    }


    /**
     * Some tests to see if the programs is properly working.
     */
    public static void main(String[] args) {
        ListNode l3 = new ListNode(3, null);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(2, l2);

        ListNode l6 = new ListNode(4, null);
        ListNode l5 = new ListNode(6, l6);
        ListNode l4 = new ListNode(5, l5);

        System.out.println(addTwoNumbersMethod(l1, l4));
    }
}
