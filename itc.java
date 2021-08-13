import java.io.*;

class buff
{
    int a;
    boolean pro = false;

    public synchronized void proc(int x)
    {
        if(pro)
        {
            System.out.println("producer waiting");
            try 
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    
        a = x;
        System.out.println("Product "+a+" is done.");
        pro = true;
        notify();
    }

    public synchronized void consumer()
    {
        if(!pro)
        {
            System.out.println("consumer waiting");
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("product "+a+" consumed");
        pro = false;
        notify();
    }
}

    class prod extends Thread
    {
        buff b;
        public prod(buff b)
        {
            this.b = b;
        }
        public void run()
        {
            System.out.println("Producer start");
            for(int i=0;i<10;i++)
            b.proc(i);
        }        
    }

    class consum extends Thread
    {
        buff b;
        public consum(buff b)
        {
            this.b = b;
        }
        public void run()
        {
            System.out.println("Consumer start");
            for(int i=0;i<10;i++)
            {
                b.consumer();
            }
        }
    }

public class itc
{
    public static void main(String[]args)
    {
        buff b = new buff();
        prod p =new prod(b);
        consum c = new consum(b);
        p.start();
        c.start();
    }
}