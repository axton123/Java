//co2_4. Employee


import java.io.*;

class emp1
{
    int eno,sal;
    String en;

    void gt(int eno,String en,int sal)
    {
        this.eno = eno;
        this.en = en;
        this.sal = sal;
    }

    void dis()
    {
        System.out.println("Emp details \n");
        System.out.println("Emp no \t:\t"+eno);
        System.out.println("Emp name \t:\t"+en);
        System.out.println("Emp salery\t:\t"+sal);
    }
}

class emp
{
    public static void main(String[] args)
    {
        emp1[] e = new emp1[5];
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        int enum1=0,enum2=0,sal1=0,i,n=0;
        String name;
        try
        {
            System.out.println("enter no of emp :");
            n = Integer.parseInt(a.readLine());
            for(i=0;i<n;i++)
            {
                System.out.println("enter empno, name, salary");
                enum1 = Integer.parseInt(a.readLine());
                name = a.readLine();
                sal1 = Integer.parseInt(a.readLine());
                e[i] = new emp1();
                e[i].gt(enum1,name,sal1);
            }
            System.out.println("enter the empno to search\t:");
            enum2 = Integer.parseInt(a.readLine());
            for(i=0;i<n;i++)
            {
                if(e[i].eno==enum2)
                {
                    e[i].dis();
                    break;
                }
            }
        }
        catch(IOException e1)
        {
            
        System.out.println(e);
        }
    }
}