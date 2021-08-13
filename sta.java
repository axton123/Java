import java.io.*;
import java.util.*;

public class sta
{
    public static void main(String[]args)
    {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        Stack <String> s = new Stack<String>();
        try
        {
            System.out.println("enter 5 str");
            for(int i=0;i<5;i++)
                s.add(a.readLine());
            System.out.println("Stack ele : "+s);
            int p = 0;
            System.out.println("enter position to remove : ");
            p = Integer.parseInt(a.readLine());
            String st = s.remove(p);
            System.out.println("Stack removed  "+st);
            System.out.println("stack : "+s);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}