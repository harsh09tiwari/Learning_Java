package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TwoSum_HASH {
    static int twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        List <String> result = new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            int find = target - arr[i];
            if(map.containsKey(find)){
                result.add("(" + find + "," + arr[i] + ")");
            }
            map.put(arr[i],i);
        }
        for (int i= result.size()-1; i>=0; i--){
            System.out.println(result.get(i));
        }

        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array : ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target : ");
        int target = sc.nextInt();

        twoSum(arr, target);
    }
}
