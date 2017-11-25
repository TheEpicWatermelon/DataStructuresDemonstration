/**
 * Node
 * a node for each part of the linked list
 * nextNode - reference point to the next node after current node, will be null if it is the last node
 * data - holds the information that the node stores, it could be of any type
 * @author Sasha Maximovitch
 * @date 10/25/2017
 * @param <T>
 */
public class Node <T> {
    private T data;
    private Node<T> nextNode;

    public Node(T data){
        this.data = data;
        this.nextNode = null;
    }

    public Node(T data, Node<T> next){
        this.data = data;
        nextNode = next;
    }

    public T getData(){
        return this.data;
    }

    public void setData(T data){
        this.data = data;
    }

    public Node<T> getNext(){
        return this.nextNode;
    }

    public void setNext(Node<T> nextNode){
        this.nextNode = nextNode;
    }

}