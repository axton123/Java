//CO1_3. Complex


import java.io.*;
public class comp
{
    int r,i;
    BufferedReader a = new BufferedReader (new InputStreamReader(System.in));
    
    public void gt()
    {
        try
        {

            System.out.println("enter real and img");
            r = Integer.parseInt(a.readLine());
            i = Integer.parseInt(a.readLine());
        }
        
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    public void sh()
    {
        System.out.println("Complex no" + r +"+i"+i);
    }

    public static void main(String[] args) 
    {
        comp c1,c2;
        c1 = new comp();
        c2 = new comp();
        c1.gt();
        c2.gt();
        c1.sh();
        c2.sh();
        int x = c1.r+c2.r;
        int y = c2.i+c2.i;
        System.out.println("sum"+ x +"i"+y);
        
    }
}