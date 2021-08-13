import java.io.*;
import java.util.LinkedList;

public class LL
{
    public static void main(String[]args)
    {
        LinkedList<String> li = new LinkedList<String>();

        li.add("abc");
        li.add("def");
        li.add("hij");
        li.add("klm");
        li.add("nop");

        System.out.println("\n"+li);

        li.clear();

        System.out.println("list cleared\n"+li);

        
        li.add("zyx");
        li.add("wvu");
        li.add("tsr");

        System.out.println(li);
    }
}