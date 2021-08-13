package gra;

import java.io.*;
interface sp
{
    final int score=10;
    public void show();
}

public class stu implements sp
{
    int roll;
    String name;
    public void get()
    {
        roll=20;
        name="abc";
    }
    public void show()
    {
        System.out.println("roll,name,score"+roll+" "+name+" "+score);
    }

}