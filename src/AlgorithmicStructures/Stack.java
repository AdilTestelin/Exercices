package AlgorithmicStructures;

/**
 * A quick implementation of a stack in Java, based on this tutorial : https://www.programiz.com/dsa/stack
 */
public class Stack {
    private int array[];
    private int capacity;
    private int top;

    /**
     * Constructor of the stack class.
     * @param size : the size that we gives to our stack.
     */
    public Stack(int size){
        this.array = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    /**
     * Function that check if a stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty(){
        return this.top == -1;
    }

    /**
     * Check is a stack is full.
     * @return true if the stack is full, false otherwise.
     */
    public boolean isFull(){
        return this.top == this.capacity-1;
    }

    /**
     * Push the element passed in parameter to the top of the stack.
     * @param elt : the element we want to push.
     */
    public void push(int elt){
        if(!isFull()){
            this.top++;
            System.out.println("Pushing " + elt);
            this.array[top] = elt;
        } else{
            System.out.println("Stack is full");
        }
    }

    /**
     * Pop the top element out of the stack.
     */
    public int pop(){
        if(!isEmpty()){
            return this.array[top--];
        } else {
            System.out.println("This stack is empty");
            return -1;
        }
    }

    /**
     * Return the top element of the stack.
     * @return the top element of the stack.
     */
    public int peek(){
        if(this.top != -1){
            return this.array[top];
        } else {
            System.out.println("This stack has not been initialized.");
            return -1;
        }
    }

    /**
     * Function that print the stack on the terminal.
     */
    public void printStack(){
        for(int i = 0; i < this.top+1; i++){
            System.out.println(this.array[i]);
        }
    }

    /**
     * Main to test quickly the implemented functions.
     */
    public static void main(String[] args) {
        System.out.println("Initialization of a stack of size 3 : ");
        Stack s = new Stack(3);
        System.out.println("");
        // Stacking of differents elements :
        s.push(3);
        s.push(2);
        s.push(1);
        s.printStack();
        System.out.println("");
        System.out.println("Printing of the top element of the stack : ");
        System.out.println(s.peek());
        System.out.println("");
        System.out.println("Popping the top element of the stack :");
        s.pop();
        System.out.println("");
        System.out.println("Printing the new top element :");
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println("Test if the isFull function works :");
        System.out.println(s.isFull());
        System.out.println("");
        System.out.println("Test if the isEmpty function works :");
        System.out.println(s.isEmpty());
        System.out.println("");
        System.out.println("Creation of a stack of size 0 : ");
        Stack emptyStack = new Stack(0);
        System.out.println("");
        System.out.println("Trying to push something in it : ");
        emptyStack.push(42);
        System.out.println(emptyStack.peek());
    }
}
