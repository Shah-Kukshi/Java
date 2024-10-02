import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        
        
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        
        int pos = 0 , neg = 0, zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 0){
                pos+=1;
            }else if(arr.get(i) == 0){
                zero+=1;
            }
            else{
                neg+=1;
            }
        }
        System.out.println("" + pos + " " + neg + " " + zero);
       float posRatio = (float) pos / arr.size(); 
       float negRatio = (float) neg / arr.size(); 
       float zeroRatio = (float) zero / arr.size(); 
        System.out.printf(" %.6f%n %.6f%n %.6f%n " , posRatio ,negRatio,zeroRatio);
    }
}
