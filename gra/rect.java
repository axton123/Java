package gra;

import java.io.*;

public class rect
{
    int l=10,b=20;
    BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
    public void getdata()
    {
        try
        {
            System.out.println("enter the len & breadth");
            l = Integer.parseInt(a.readLine());
            b = Integer.parseInt(a.readLine());
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    public void area()
    {
        System.out.println("Area of rect"+l*b);
    }
}