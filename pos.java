import java.io.*;

class mye extends Exception
{
    mye(String msg)
    {
        super(msg);
    }
}

class pos
{
    public static void main(String[]args)throws IOException
    {
        int a[] = new int[5];
        int l=0,i,s=0,av=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("enter 5 val");
            for(i=0;i<5;i++)
            {
                l = Integer.parseInt(br.readLine());
                if(l<0)
                    throw new mye("enter -ve num");
                else
                    a[i]=l;
                av=i+1;
            }
        }
        catch(mye e)
        {
            System.out.println("caught exception");
            System.out.println(e.getMessage());
        }
        System.out.println("Array ele : ");
        for(i=0;i<5;i++)
            s+=a[i];
        System.out.println("avg : "+(float)((float)s/av));
    }
}