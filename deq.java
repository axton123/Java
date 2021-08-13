import java.util.*;
public class deq
{
    public static void main(String[]args)
    {
        Deque<String> dq = new LinkedList<String>();
        dq.add("ele 1");
        dq.addFirst("ele 2");
        dq.addLast("ele 3");
        dq.push("ele 4");
        dq.offer("ele 5");
        dq.offerFirst("ele 6");

        System.out.println("\nd"+dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println("\n\n"+dq);
    }

}