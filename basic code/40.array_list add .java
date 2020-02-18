
import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("size : "+arr.size());//find arraylist size
        //adding element in list
        arr.add(10);
        arr.add(20);
        arr.add(2,30);
        //print element using for each loop
        for(int x: arr){
            System.out.println(" "+x);
        }
       System.out.println("size : "+arr.size()); 
        
    }
 
}
