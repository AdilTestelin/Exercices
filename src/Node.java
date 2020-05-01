class Node {

    private Node next;
    private int data;

    public Node (int data){
        this.data = data;
    }

    public static int countNodes(Node head) {
        int cpt = 1;
        while(head.next != null){
            head = head.next;
            cpt++;
        }
        return cpt;
    }

    private void setNext(Node nextNode){
        this.next = nextNode;
    }

    public static void main(String[] args) {
        Node test = new Node(5);
        Node test1 = new Node(5);
        Node test2 = new Node(5);
        Node test3 = new Node(5);

        test.setNext(test1);
        test1.setNext(test2);
        test2.setNext(test3);
        System.out.println(countNodes(test));
    }
}