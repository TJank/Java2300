import java.util.LinkedList;

public class IntegerLinkedListTest {

    public static void main(String[] args) {

        IntegerLinkedList numbers = new IntegerLinkedList();
        System.out.println("Number of items in list: "+
                numbers.getNumberOfItems() + "\n" + numbers.toString());

        System.out.println(numbers.delete(2));

        // insert numbers
        numbers.insert(2);
        System.out.println(numbers.delete(2));

        System.out.println("Number of items in list: "+
                numbers.getNumberOfItems() + "\n" + numbers.toString());

        numbers.insert(5);
        numbers.insert(8);
        numbers.insert(100);
        System.out.println(numbers.delete(10));
        System.out.println("Number of items in list: "+
                numbers.getNumberOfItems() + "\n" + numbers.toString());

        System.out.println(numbers.delete(8));
        System.out.println("Number of items in list: "+
                numbers.getNumberOfItems() + "\n" + numbers.toString());


    }
}
