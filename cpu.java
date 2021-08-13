//CO1_5. CPU


import java.io.*;

class cpu
{
    int p=5000;

    class pro
    {
        int core = 2;
        String manuf = " Intel ";
    }

    static class ram
    {
        String mem = "2 GB";
        String manuf = "IBM";
    }

    public static void main(String [] args) throws IOException
    {
        cpu c = new cpu();
        cpu.pro p = c.new pro();
        cpu.ram r = new cpu.ram();

        System.out.println("price "+ p);
        System.out.println("cores & manuf "+p.core + "  " + p.manuf);
        System.out.println("mem & manuf " + r.mem + " " + r.manuf);
    }
}