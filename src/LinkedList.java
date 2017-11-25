/**
 * LinkedList
 * stores a one-way list and has different methods to work with the list
 * @author Sasha Maximovitch
 * @date 10/25/2017
 * @param <T> any variable type
 */

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void add(T item){

        if (head == null){
            head = new Node<T>(item);
            return;
        }

        Node<T> temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        Node<T> created = new Node<T>(item);
        temp.setNext(created);
        return;
    }

    public void remove(int index){
        Node tempNode = head;

        if( (index == 0) && (head.getNext() == null) ){
            head = null;
            return;
        }else if(index == 0){
            head = head.getNext();
        }

        for(int i = 0; i < index - 1; i++){
            tempNode = tempNode.getNext();
        }

        Node deleted = tempNode.getNext();
        if(deleted.getNext() == null){
            tempNode.setNext(null);
            return;
        } else{
            tempNode.setNext(deleted.getNext());
            return;
        }
    }

    public T get(int index){
        Node tempNode = head;
        for(int i = 0; i < index; i++){
            tempNode = tempNode.getNext();
        }
        return (T)tempNode.getData();
    }

    public int indexOf(T item){
        int index = 0;
        Node tempNode = head;
        boolean found = false;

        if(head.getData() == item){
            return 0;
        }

        while(tempNode.getNext() != null){
            tempNode = tempNode.getNext();
            if(tempNode.getData() == item){
                found = true;
                break;
            }
            index++;
        }
        if(found == true){
            return index;
        }else{
            return -1;
        }
    }

    public void clear(){
        head = null;
    }

    public int size(){
        int length = 0;
        if(head == null){
            return length;
        }
        Node tempNode = head;
        length++;
        while(tempNode.getNext() != null){
            length++;
            tempNode = tempNode.getNext();
        }
        return length;
    }


}
