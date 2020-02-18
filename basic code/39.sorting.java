import java.util.Arrays;
public class Sort_array {
    public static void main(String[] args) {
        int[] arr={10,2,13,3,5};
        Arrays.sort(arr);
        System.out.println("Sort number in assending order : ");
        for(int i=0;i<5;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("sort in decending order : ");
        for(int j=4;j>=0;j--){
            System.out.print(" "+arr[j]);
        }
        System.out.println();
        System.out.println("String sorting assending order: ");
        String[] names={"sakib","musfiq","alamin","imrul"};
        Arrays.sort(names);
        for(int k=0;k<4;k++){
        System.out.print(names[k]+" ");     
        }
        System.out.println();
        System.out.println("Sort string decending order : ");
        for (int l = 3; l >=0; l--)
        {
            System.out.print(names[l]+" ");   
        }
        System.out.println();
        }
   
}
