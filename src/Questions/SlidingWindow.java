package Questions;

public class SlidingWindow {

    public static void main(String[] args){
        int[] arr = {1,3,-1,10,5,3,6,7};
        int k = 4;


        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int low = 0;
        int high = k-1;

        for(int i = 0; i <= high; i++){
            sum += arr[i];
        }
        maxSum = sum;

        while(high < arr.length - 1){

            sum = sum - arr[low];
            low++;
            high++;
            sum = sum + arr[high];

            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
