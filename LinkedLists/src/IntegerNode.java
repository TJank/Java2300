public class IntegerNode {

    private int data;
    private IntegerNode next;

    /*
     * Default constructor
     */
    public IntegerNode() {
        data = 0;
        next = null;
    }

    /*
     * Overloaded constructor
     */
    public IntegerNode(int data) {
        setData(data);
        next = null;
    }

    // Accessor methods
    public int getData() {
        return data;
    }

    public IntegerNode getNext() {
        return next;
    }

    // Mutator methods
    public void setData(int data) {
        this.data = data;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }
}
