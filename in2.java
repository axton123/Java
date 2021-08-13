import java.io.*;
 

interface are
 {
     void area();
     void per();
 }


 class rect implements are
 {
     int l=10,b=20;
     public void area()
     {
         System.out.println("area of rectangle"+l*b);
     }
     public void per()
     {
         System.out.println("per of rectangle"+2*(l*b));
     }
 }

 class cir implements are
 {
     int r=10;
     public void area()
     {
         System.out.println("area of circle"+3.14*r*r);
     }
     public void per()
     {
         System.out.println("per of cir"+2*3.14*r);
     }
 }

 class in2
 {
     public static void main(String[]args)
     {
         rect r = new rect();
         cir c = new cir();
         int ch = 0;
         BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
         try 
         {
             System.out.println("enter 1.Circle \n2.rect");
             ch =Integer.parseInt(a.readLine());
             switch(ch)
             {
                 case 1:
                    c.area();
                    c.per();
                    break;
                 case 2:
                    r.area();
                    r.per();
                    break;
             }
         }
         catch(IOException e)
         {
             System.out.println(e);
         }
     }
 }