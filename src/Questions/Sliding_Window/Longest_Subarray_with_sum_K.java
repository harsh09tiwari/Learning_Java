package Questions.Sliding_Window;

public class Longest_Subarray_with_sum_K {
    public static void main(String[] args){
        int[] arr = {3,4,5,-1,-5,9,4,5,6};
        int k = 6;

        int sum = 0;
        int maxLength = 0;

        for(int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                sum += arr[j];
                if (sum <= k){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        System.out.println(maxLength);
    }
}
