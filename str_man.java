//CO2_3. String manipulation


import java.io.*;

class str_man
{
    public static void main(String[] args)
    {
        String s1,s2,s3;
        int ch;
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.println("Enter 2 str");
            s1 = a.readLine();
            s2 = a.readLine();
            do
            {
                System.out.println("enter ur choice\n 1.copy 2.append 3.reverse 5.exit");
                ch = Integer.parseInt(a.readLine());
                switch(ch)
                {
                    case 1:
                        s3 = s1;
                        System.out.println("copied str "+s3);
                        break;
                    
                    case 2:
                        s3 = s1+" "+s2;
                        System.out.println("appended str"+s3);
                        break;
                    
                    case 3:
                        int x = s1.compareTo(s2);
                        if(x==0)
                            System.out.println("str equal");
                        else if(x<0)
                            System.out.println("II str larger");
                        else
                            System.out.println("str equal");
                        break;
                    case 4:
                        s3 = new StringBuffer(s1).reverse().toString();
                        System.out.println("reverse str "+s3);
                        break;
                }
            }while(ch<5);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}