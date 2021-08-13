import java.util.*;

public class hash_s
{
    public static void main(String[] args)
    {
        HashSet<String> h = new HashSet<String>();
        h.add("r");
        h.add("g");
        h.add("b");
        h.add("c");
        h.add("y");

        for(String ele : h)
        {
            System.out.println("1st : "+ele);
        }
        HashSet<String> h2 = new HashSet<String>();
        h2.add("r");
        h2.add("g");
        h2.add("b");
        h2.add("f");
        h2.add("y");
        for(String ele : h2)
        {
            System.out.println("1st : "+ele);
        }
        
        for(String ele : h)
        {
            System.out.println(h2.contains(ele) ? "YES" : "NO");
        }
    }
}