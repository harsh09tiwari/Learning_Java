package Questions;
import java.util.*;

public class Bs {
    public static int BinarySearch(int arr[], int target){
        int low = arr[0];
        int high = arr.length-1;
        while (low <= high){
            int mid = low + (high-low)/2;

            if (arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void InsertionSort(int[] arr, int n){
        for (int i=0; i<n; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for (int i=0; i< n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int target  = sc.nextInt();
//        System.out.println(BinarySearch(arr, target));
        InsertionSort(arr, n);
    }

}
