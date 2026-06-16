package Day17.Collections.Queues;

import java.util.LinkedList;

public class Queue {
public static void main(String[] args){
    java.util.Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.offer(2);
    q.add(3);
    q.offer(4);
    q.offer(5);

    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q.remove());
    System.out.println(q);
    q.clear();
    System.out.println(q.poll());
    q.offer(6);
    q.offer(7);

    System.out.println(q.peek());
}
}
