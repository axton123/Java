import java.io.*;
import java.util.*;

class stack<T>
{
    ArrayList<T> A;
    int TOP = -1,size;

    stack(int size)
    {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void pu(T X)
    {
        if(TOP + 1 == size)
        {
            System.out.println("Overflow");
        }
        else 
        {
            TOP +=1;
            A.add(X);
        }
    }
    T top()
    {
        if(TOP == -1)
        {
            System.out.println("Underflow");
            return null;
        }
        else
            return A.get(TOP);
    }

    void pop()
    {
        if(TOP ==-1)
            System.out.println("Underflow");
        else
            TOP--;
    }

    boolean empty()
    {
        return TOP == -1;
    }

    public String toString()
    {
        String Ans = "";
        for(int i=0;i<TOP;i++)
            Ans+=String.valueOf(A.get(i))+"->";
        Ans+=String.valueOf(A.get(TOP));
        return Ans;
    }
}

public class ast
{
    public static void main(String [] args)
    {
        stack<Integer> s1 = new stack<Integer>(3);
        s1.pu(10);s1.pu(20);s1.pu(30);
        System.out.println("s1 after pushing s1 :\n"+s1);
        s1.pop();
        System.out.println("s1 after pop s1 :\n"+s1);
    }
}