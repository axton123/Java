import java.io.*;

class em
{
    int e,s;
    String n,a;

    em(int e, String n, int s, String a)
    {
        this.e=e;
        this.n=n;
        this.s=s;
        this.a=a;
    }
}

class tr extends em
{
    String d,su;
    
    tr(int e, String n, int s, String a, String d, String su)
    {
        super(e,n,s,a);
        this.d=d;
        this.su=su;
    }
    void dis()
    {
        System.out.println("emp details : ");
        System.out.println("emp details :"+ e);
        System.out.println("emp details : "+n);
        System.out.println("emp details : "+s);
        System.out.println("emp details : "+a);
        System.out.println("emp details : "+d);
        System.out.println("emp details : "+su);
    }
}

class in
{
    public static void main(String [] args)
    {
        tr []r = new tr[5];
        BufferedReader b = new BufferedReader (new InputStreamReader(System.in));
        int eno=0,sak=0,i,n=0;
        String name,add,dept,sub;
        try
        {
            System.out.println("Enter  no of emp: ");
            n = Integer.parseInt(b.readLine());

            for(i=0;i<n;i++)
            {
                System.out.println("enter the empno, ename, sal, add, dept, sub : ");
                eno = Integer.parseInt(b.readLine());
                name = b.readLine();
                sak = Integer.parseInt(b.readLine());
                add = b.readLine();
                dept = b.readLine();
                sub = b.readLine();
                r[i] = new tr(eno,name,sak,add,dept,sub);
            }
        }
        catch(IOException e1)
        {
            System.out.println(e1);
        }
        for(i=0;i<n;i++)
        {
            r[i].dis();
        }
    }
}