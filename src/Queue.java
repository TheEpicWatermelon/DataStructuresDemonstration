/**
 * Queue
 * stores a one-way list and has different methods to work with the list
 * @author Sasha Maximovitch
 * @date 10/30/2017
 * @param <T> any variable type
 */

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    public Queue(){
        this.head = null;
        this.tail = null;
    }

    public void enqueue(T item){

        if (head == null){
            head = new Node<T>(item);
            tail = head;
            return;
        }

        Node<T> temp = tail;
        tail = new Node<T>(item);
        temp.setNext(tail);
        return;
    }

    public T dequeue(){
        Node tempNode = head.getNext();

        T data;

        if(tempNode == null){
            data = head.getData();
            head = null;
            return data;
        }

        data = head.getData();
        head = tempNode;
        return data;
    }
}
