package Questions;
import java.util.*;

public class TwoSum_BF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array : ");
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target : ");
        int target = sc.nextInt();


        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("("+ arr[i]  + "," + arr[j] +")");
                }
            }
        }
    }
}
