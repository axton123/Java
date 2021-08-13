//CO2_2. String searching


import java.io.*;

class arra
{
    public static void main(String[] args)
    {
        int []arr = new int[5];
        int it = 0,flag = 0,i = 0;
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("enter 5 num");
            for(i=0;i<5;i++)
            {
                arr[i] = Integer.parseInt(a.readLine());
            }
            System.out.println("Enter the it to search");
            it = Integer.parseInt(a.readLine());
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        for(i=0;i<5;i++)
        {
            if(it == arr[i])
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("item found "+(i+1));
        else
            System.out.println("item not found");
    }
}