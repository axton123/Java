//CO2_1. Sort string


import java.io.*;
public class sort_srt
{
    public static void main(String[] args) throws IOException
    {
        String[] ar = {"java","cpp","vb","python"};
        int size = ar.length;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(ar[i].compareTo(ar[j])>0)
                {
                    String t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        } 
        for(int i=0;i<size;i++)
        {
            System.out.println(ar[i]);
        }
    }
}