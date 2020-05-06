package addTwoNumbersPackage;

public class addTwoNumbers {

    public static int power(int p){
        int nbr = 10;
        for(int i = 1; i < p; i++){
            nbr *= 10;
        }
        return nbr;
    }

    public static int addTwoNumbersMethod(ListNode l1) {
        int exp = 0;
        int r1 = 0;
        int r2 = 0;

        while(l1.next != null) {
            if(exp > 0) {
                r1 += l1.val * power(exp);
            } else {
                r1 += l1.val;
            }
            exp++;
            l1 = l1.next;
        }
        return r1;
    }


    public static void main(String[] args) {
        ListNode l3 = new ListNode(3, null);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(2, l2);

        System.out.println(addTwoNumbersMethod(l1));
    }
}
