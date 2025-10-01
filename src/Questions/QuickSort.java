package Questions;
import java.util.*;

import static java.util.Collections.*;

public class QuickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;

        while (i < j){
            while (arr[i] <= pivot && i< high) i++;

            while (arr[j] > pivot && j >= low) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    public static void qs(int[] arr, int low, int high){
        if (low < high){
            int pivot_idx = partition(arr, low, high);
            qs(arr, low, pivot_idx-1);
            qs(arr, pivot_idx+1, high);
        }
    }
    public static void main(String args[]){
        int arr[] = {6, 3,9,5,2,8};
        int n = arr.length;

        qs(arr, 0, n-1);

        for (int i =0; i< n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}



