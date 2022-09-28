import java.util.*;
public class hw1{
    public static void main(String[] args) throws Exception{
        TreeSet<Integer> tset = new TreeSet<>();
        
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int r = (int)(Math.random()*100)+1;
            arr[i]=r;
             
        }
        System.out.println(Arrays.toString(arr));
        
        for(int t:arr){
            tset.add(t);
        }
        System.out.println(tset.first());
        System.out.println(tset.last());
        System.out.println("Between 30~70: " + tset.subSet(30, 70));
        
    }
}