/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-01
 * Time:22:05
 **/
class Node{
    private Node next;
    private Node prev;
    private int data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node(int data) {
        this.data = data;
    }
}
public class DoubleLinkedList {

    public Node head;
    public Node tail;

    public void addFirst(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        node.setNext(this.head);
        this.head.setPrev(node);
        head = node;

    }
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        }else {
            this.tail.setNext(node);
            node.setPrev(this.tail);
            this.tail = node;
        }
    }
    public void addIndex(int index,int data){
        
    }
    public boolean contains(int key){
        Node cur = this.head;
        while(cur != null){
            if (cur.getData() == key){
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    public void remove(int key){

    }
    public void removeAllKey(int key){

    }
    public int size(){
       Node cur = this.head;
       int count = 0;
       while(cur != null){
          count++;
          cur = cur.getNext();
       }
       return count;
    }
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.getData()+" ");
            cur = cur.getNext();
        }
    }
    public void clear(){

    }
    public static void main(String[] args) {

    }
}
