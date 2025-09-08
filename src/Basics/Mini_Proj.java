package Basics;

import java.util.Scanner;

public class Mini_Proj {
    public static void main(String[] args){
        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);

        int userNumber = 0;

        do{
            System.out.print("Enter the number: ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber){
                System.out.println("You guessed it");
                break;
            }
            else if (userNumber > myNumber) {
                System.out.println("Number is too large");
            }
            else{
                System.out.println("Number is too small");
            }
        }while (userNumber >= 0 );

        System.out.print("MY NUMBER WAS: ");
        System.out.println(myNumber);

    }
}
