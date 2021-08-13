import java.util.Arrays;

public class bub<T extends Comparable<? super T>>
{
    T[] ar;
    bub(T[] ar)
    {
        this.ar = ar;
    }
    private T[] bu()
    {
        for(int i=ar.length;i>1;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                if(ar[j].compareTo(ar[j+1]) > 0)
                    swapEle(j,ar);
            }
        }
        return ar;
    }
    
    private void swapEle(int index,T[] arr)
    {
        T temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = temp;
    }

    public static void main(String[]args)
    {
        Integer[] ina = {47,62,34,77,88,2,94,10};
        bub<Integer> bs1 = new bub<Integer>(ina);
        Integer[] sa1 = bs1.bu();
        System.out.println("sorted : "+Arrays.toString(sa1));
        
        String[] stra = {"abc","qwer","a","iyutisa"};
        bub<String> bs2 = new bub<String>(stra);
        String[] sa2= bs2.bu();
        System.out.println("sorted : "+Arrays.toString(sa2));

        /*Float[] fla = {47.0f,34.0f,2.0f,10.0f};
        bub<FLoat> bs3 = new bub<Float>(fla);
        Float[] sa3 = bs3.bu();
        System.out.println("sorted : "+Arrays.toString(sa3));*/

    }
}