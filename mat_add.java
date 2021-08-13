//CO1_2. Matrix add


import java.io.*;

public class mat_add
{
    public static void main(String[] args)
    {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        BufferedReader q = new BufferedReader( new InputStreamReader(System.in));
        try 
        {
            int i,j;
            System.out.println("Enter details mat 1: ");
            for(i=0;i<2;i++)
            {
                for(j=0;j<2;j++)
                {
                    a[i][j] = Integer.parseInt(q.readLine());
                }
                System.out.println();
            }
            System.out.println("Enter details mat 2: ");
            for(i=0;i<2;i++)
            {
                for(j=0;j<2;j++)
                {
                    b[i][j] = Integer.parseInt(q.readLine());
                }
                System.out.println();
            }
            
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print(c[i][j]+"\t");
        }
        System.out.println();
    }
}
}