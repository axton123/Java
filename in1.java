import java.io.*;
class st
{
    int roll;
    String name;
    float ma;

    void get(int roll,String name,float ma)
    {
        this.roll=roll;
        this.name=name;
        this.ma=ma;
    }
}

interface sp
{
    final int sc=10;
    void show();

}


class result extends st implements sp
{
    public void show()
    {
        System.out.println("roll : "+roll);
        
        System.out.println("name : "+name);
        
        System.out.println("mark : "+ma);
        System.out.println("score : "+sc);
    }
}

class in1
{
    public static void main(String[]args)
    {
        int roll=0;
        String name="";
        float ma=0;
        result r=new result();
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("enter the roll nmae and mark");
            roll=Integer.parseInt(a.readLine());
            name=a.readLine();
            ma=Float.parseFloat(a.readLine());
        }
        catch(IOException e)
        {
            System.out.println(e);

        }
        r.get(roll,name,ma);
        r.show();
    }
}