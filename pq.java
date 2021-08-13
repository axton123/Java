import java.util.*;

class pq
{
    public static void main(String[]args)
    {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(); 

        p.add(10);
        p.add(50);
        p.add(20);
        p.add(23);
        p.add(12);

        System.out.println("Queue : " + p);
        System.out.println("peek : "+p.peek());

        System.out.println("removed"+p.poll());
        System.out.println("queue "+p);
        p.remove(50);
        System.out.println("queue "+p);
        
    }
}