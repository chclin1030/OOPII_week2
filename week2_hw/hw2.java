import java.util.*;
public class hw2 {
    public static void main(String[] args) throws Exception{
        var hmap = new HashMap<>();
        hmap.put("1","January");
        hmap.put("2","February");
        hmap.put("3","March");
        hmap.put("4","April");
        hmap.put("5","May");
        hmap.put("6","June");
        hmap.put("7","July");
        hmap.put("8","August");
        hmap.put("9","September");
        hmap.put("10","October");
        hmap.put("11","November");
        hmap.put("12","December");

        Scanner sc = new Scanner(System.in);
        System.out.println("�п�J1~12?");
        String st1 = sc.nextLine();
        if(hmap.containsKey(st1)){
            System.out.println("��"+st1+"�몺�^���r��"+hmap.get(st1));
        }else{
            System.out.println("Range error!!!");
        }

    }
}
