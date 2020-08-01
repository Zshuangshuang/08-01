/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-01
 * Time:22:27
 **/
public class TestDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addLast(20);
        doubleLinkedList.addLast(30);
        doubleLinkedList.addLast(40);
        doubleLinkedList.display();
        System.out.println(doubleLinkedList.size());
        System.out.println(doubleLinkedList.contains(20));
    }
}
