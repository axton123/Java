import java.io.*;
import java.util.*;

class arrl
{
    public static void main(String[]args)
    {
        int n=5;
        ArrayList <Integer> a = new ArrayList<Integer>(n);

        for(int i=1;i<=n;i++)
        {
            a.add(i);
        }
        System.out.println(a);
        a.remove(3);
        System.out.println(a);

        a.add(2,33);
        a.set(4,55);

        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i)+" ");
        }
    }
}