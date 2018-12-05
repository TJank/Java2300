public class IntegerLinkedList {

    private IntegerNode head;
    private int numberOfItems;

    // Constructors


    public IntegerLinkedList() {
        head = null;
        numberOfItems = 0;
    }

    public IntegerLinkedList(IntegerNode head, int numberOfItems) {
        this.head = head;
        this.numberOfItems = numberOfItems;
    }

    // Accessor
    public int getNumberOfItems() {
        return numberOfItems;
    }

    // Insert method
    public void insert(int value) {
        IntegerNode intNd = new IntegerNode(value);
        intNd.setNext(head);
        head = intNd;
        numberOfItems++;
    }

    // Delete Method
    public boolean delete(int value) {
        IntegerNode current = head;
        IntegerNode previous = null;

        while(current != null && current.getData() != value) {
            previous = current;
            current = current.getNext();
        }

        if(current == null) {
            return false;
        }
        else {
            if(current == head) {
                head = head.getNext();
            }
            else {
                previous.setNext(current.getNext());
            }

            numberOfItems--;
            return true;
        }
    }

    @Override
    public String toString() {
        String listString = "";
        IntegerNode current = head;
        for(int i=0; i<numberOfItems; i++) {
            listString += current.getData() + " ";
            current = current.getNext();
        }
        return listString;
    }
}
