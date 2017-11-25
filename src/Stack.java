/**
 * Stack
 * stores a one-way list and has different methods to work with the list
 * @author Sasha Maximovitch
 * @date 10/30/2017
 * @param <T> any variable type
 */

public class Stack<T> {

    private Node<T> head;

    public Stack(){
        this.head = null;
    }

    public void push(T item){

        if (head == null){
            head = new Node<T>(item);
            return;
        }

        Node<T> tempNode = head;
        head = new Node<T>(item);
        head.setNext(tempNode);
        return;
    }

    public T pop(){
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