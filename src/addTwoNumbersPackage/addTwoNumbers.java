package addTwoNumbersPackage;

public class addTwoNumbers {

    public static int power(int p){
        int nbr = 10;
        for(int i = 1; i < p; i++){
            nbr *= 10;
        }
        return nbr;
    }

    public static ListNode addTwoNumbersMethod(ListNode l1, ListNode l2) {
        ListNode[] listnode = new ListNode[100];
        int exp = 1;
        int r1 = l1.val;
        //System.out.println("Valeur du noeud courant l1 : " + l1.val);
        int r2 = l2.val;
        // System.out.println("Valeur de r2 : " + r2);
        while(l1.next != null) {
            l1 = l1.next;
            r1 += l1.val * power(exp);
            exp++;
            //System.out.println("Valeur du noeud courant l2 : " + l1.val);
        }
        // System.out.println("VALEUR DE R1 : " + r1);

        exp = 1;
        while(l2.next != null) {
            l2 = l2.next;
            r2 += l2.val * power(exp);
            System.out.println("Valeur courrante de r2 : " + r2);
            exp++;
            //System.out.println("Valeur du noeud courant l2 : " + l2.val);
        }
        // System.out.println("VALEUR DE R2 : " + r2);
        int r3 = r1 + r2;

        int i = 0;
        listnode[0] = new ListNode(r3%10);
        r3 /= 10;
        // System.out.println("Valeur de r3 : " + r3);
        // System.out.println("Valeur du noeud courant r3 :" + listnode[i].val);
        while (r3 != 0){
            ListNode current = new ListNode(r3%10);
            listnode[i].next = current;
            i++;
            listnode[i] = current;
            // System.out.println("Valeur de r3 : " + r3);
            // System.out.println("Valeur du noeud courant r3 :" + listnode[i].val);
            r3 /= 10;
        }
        return listnode[0];
    }


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
