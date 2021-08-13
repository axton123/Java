import java.util.*;

class map
{
    public static void main(String[]args)
    {
        HashMap<String, Integer> h = new HashMap<String, Integer>();

        h.put("a", new Integer(100));
        h.put("b", new Integer(200));
        h.put("c", new Integer(300));
        h.put("d", new Integer(400));
        
        System.out.println("Initial map :");

        for(Map.Entry<String, Integer> m : h.entrySet())
        {
            System.out.println(m.getKey()+" : ");
            System.out.println(m.getValue());
        }
        System.out.println("map updated : ");
        h.put("c", new Integer(500));
        for(Map.Entry<String, Integer> m : h.entrySet())
        {
            System.out.println(m.getKey()+" : ");
            System.out.println(m.getValue());
        }
        h.remove("a");
        System.out.println("map content");
        for(Map.Entry<String, Integer> m : h.entrySet())
        {
            System.out.println(m.getKey()+" : ");
            System.out.println(m.getValue());
        }
    }
}