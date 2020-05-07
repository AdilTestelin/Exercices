package addTwoNumbersPackage;

public class addTwoNumbers {

    public static int power(int p){
        int nbr = 10;
        for(int i = 1; i < p; i++){
            nbr *= 10;
        }
        return nbr;
    }

    public static int addTwoNumbersMethod(ListNode l1, ListNode l2) {
        ListNode[] listnode = new ListNode[1000];
        int exp = 1;
        int r1 = l1.val;
        System.out.println("Valeur du noeud courant l1 : " + l1.val);
        int r2 = l2.val;

        while(l1.next != null) {
            l1 = l1.next;
            r1 += l1.val * power(exp);
            exp++;
            System.out.println("Valeur du noeud courant l2 : " + l1.val);
        }

        exp = 1;
        while(l2.next != null) {
            l2 = l2.next;
            r2 += l2.val * power(exp);
            exp++;
            System.out.println("Valeur du noeud courant l2 : " + l2.val);
        }
        int r3 = r1 + r2;

        int i = 0;
        listnode[i] = new ListNode(r3%10, listnode[i+1]);
        while (r3 != 0){
            //
        }
        return r3;
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
