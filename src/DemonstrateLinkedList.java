/**
 * DemonstrateLinkedList
 * demonstrates all the aspects of my custom linked list
 * @author Sasha Maximovitch
 * @date 10,25,2017
 *
 */
public class DemonstrateLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        int[] nums = new int[10];
        for(int i = 0; i < 10; i++){
            double rand = (Math.random()*100 +1.0);
            int randInt = (int)rand;
            list.add(randInt);
        }

        System.out.println(list.get(2));
        System.out.println(list.size());

        list.remove(0);

        Queue<Integer> q = new Queue<>();

        q.enqueue(2);

        System.out.println(q.dequeue());

        Stack<Integer> s = new Stack<>();

        s.push(1000000);

        System.out.println(s.pop());

    }

}