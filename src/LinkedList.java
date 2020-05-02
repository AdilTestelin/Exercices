/**
 * Class that provides an implementation of a LinkedList.
 * @param <E> : a generic type, which represent the type of the data that are in the LinkedList.
 */
public class LinkedList<E> {

    /**
     * Inner class that represents a node in our representation of a LinkedList.
     */
    private class Node {
        private E value;
        private Node next;

        /**
         * Constructor of our node inner class.
         * @param value : the value of our node.
         * @param next : the next element of our node.
         */
        private Node(E value, Node next){
            this.value = value;
            this.next = next;
        }

        /**
         * Tells if the list have a next element.
         * @return : true if the list have a next element, false otherwise.
         */
        public boolean hasNext(){
            return this.next == null;
        }
    }

    private Node head;

    /**
     * Constructor of out LinkedList class.
     */
    public LinkedList(){
        this.head = null;
    }

    /**
     * Tells if the current LinkedList is empty or not.
     * @return a boolean, true if it's empty, false otherwise.
     */
    public boolean isEmpty(){
        return this.head == null;
    }

    /**
     * Add an element at the head of our LinkedList.
     * @param newHead : the new head of our LinkedList.
     */
    public void add(Node newHead){
        if (!this.isEmpty()) {
            newHead.next = this.head;
        }
        this.head = newHead;
    }

    /**
     * Removes the first element of our LinkedList.
     */
    public void remove(){
        if(this.head.next == null){
            this.head = null;
        } else {
            this.head = this.head.next;
        }
    }

    /**
     * Return the head of the list.
     * @return : the head of the list.
     */
    public Node head(){
        return this.head;
    }


    /**
     * Tells if a LinkedList contains an element or not.
     * @param element : the element that we want to compare to each elements of our Linkedlist.
     * @return : true if the element is in our list, false otherwise.
     */
    public boolean contains(E element){
        Node next = this.head;
        while(next.hasNext()){
            if(next.value != element){
                next = next.next;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * Gives us the size of the list.
     * @return : the size of the list.
     */
    public int size(){
        int cpt = 0;
        Node next = this.head;
        while(next.hasNext()){
            cpt++;
            next = next.next;
        }
        return cpt;
    }
}
