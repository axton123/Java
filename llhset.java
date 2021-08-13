import java.util.LinkedHashSet;

public class llhset
{
    public static void main(String[]args)
    {
        LinkedHashSet<String> i = new LinkedHashSet<String>();
        i.add("A");
        i.add("b");
        i.add("c");
        i.add("d");
        i.add("A");
        i.add("e");

        System.out.println("size : "+i.size());
        System.out.println("orginal LHS : "+i);
        System.out.println("Remove : "+i.remove("d"));
        System.out.println("search : "+i.contains("A"));
        System.out.println("size : "+i);     
    }
}