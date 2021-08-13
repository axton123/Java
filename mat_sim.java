//CO1_4. Matrix symmetric or not

import java.io.*;

public class mat_sim
{
    public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];

        int r = 0;
        int c = 0;
        int flag = 0;
        BufferedReader q = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of row & columns");
        try
        {
            r = Integer.parseInt(q.readLine());
            c = Integer.parseInt(q.readLine());

            System.out.println("enter details of matrix: ");

            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    a[i][j] = Integer.parseInt(q.readLine());
                }
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j] = a[i][j];
            }
        }
        if(r == c)
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(b[i][j]!=a[i][j])
                    {
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 1)
                System.out.println("Matrix is not symmetric");
            else
                System.out.println("Matrix is symmetric");
        }
        else
            System.out.println("Since matrix is not square matrix, it is not symmetric");
    }
}