//CO1_1. Product


import java.io.*;

public class pro
{
    int pc,pr;
    String pn;

    BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
    
    public void gt()
    {
        try
        {
            System.out.println("Enter pcode, price, pname");
            pc = Integer.parseInt(a.readLine());
            pr = Integer.parseInt(a.readLine());
            pn = a.readLine();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
    public void show()
    {
        System.out.println("pcode: "+pc);
        System.out.println("pname: "+pn);
        System.out.println("price: "+pr);
    }

    static void com(pro a1, pro a2, pro a3)
    {
        System.out.println("the product with lowest price:");
        if(a1.pr<a2.pr && a1.pr<a3.pr)
        {
            System.out.println("pcode: "+a1.pc);
            System.out.println("pname: "+a1.pn);
            System.out.println("price: "+a1.pr);
        }
        else if(a2.pr<a1.pr && a2.pr<a3.pr)
        {
            System.out.println("pcode: "+a2.pc);
            System.out.println("pname: "+a2.pn);
            System.out.println("price: "+a2.pr);
        }
        else
        {
            System.out.println("pcode: "+a3.pc);
            System.out.println("pname: "+a3.pn);
            System.out.println("price: "+a3.pr);
        }
    }
    public static void main(String[] args) throws IOException
    {
        pro a1,a2,a3;
        a1 = new pro();
        a2 = new pro();
        a3 = new pro();
        a1.gt();
        a2.gt();
        a3.gt();
        a1.show();
        a2.show();
        a3.show();
        com(a1,a2,a3);
    }
}