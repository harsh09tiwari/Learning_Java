package Questions;

import java.util.Scanner;

public class LuckyNumberMatrix {

    //   Calculating Largest row sum + Largest column sum

    public static int calculate(int row, int col, int[][] arr){

        int maxRowSum = Integer.MIN_VALUE;
        int maxColSum = Integer.MIN_VALUE;

        for (int i=0; i<row; i++){
            int rowSum = 0;
            for (int j=0; j<col; j++){
                rowSum += arr[i][j];
            }
            maxRowSum = Math.max(maxRowSum, rowSum);
        }

        for (int i=0; i<col; i++){
            int colSum = 0;
            for (int j=0; j<row; j++){
                colSum += arr[j][i];
            }
            maxColSum = Math.max(maxColSum, colSum);
        }
        return maxRowSum + maxColSum;
    }



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the size of col: ");
        int col = sc.nextInt();

        System.out.println("enter the elements : ");
        int[][] arr =  new int[row][col];


        for (int i=0; i< row; i++){
            for (int j =0; j< col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = calculate(row, col, arr);

        System.out.println(sum);


    }
}
