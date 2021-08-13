import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class hasht
{   
    public static void main(String []args)
    {
        HashMap<String, String> m = new HashMap<String, String>();

        m.put("1","A");
        m.put("2","B");
        m.put("5","E");
        m.put("4","D");
        m.put("3","C");
        m.put("6","F");
        m.put("7","G");
        m.put("8","H");

        System.out.println("\nhash : " +m);

        TreeMap<String, String> s = new TreeMap<String,String>(m);
        System.out.println("\ntree :"+s );
    }
}