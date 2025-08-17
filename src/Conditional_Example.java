import java.util.Scanner;

public class Conditional_Example {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to know what u can buy : ");

        int amt = sc.nextInt();


        if(amt > 10){
            System.out.println("U Can buy Pen");
        }
        else{
            System.out.println("U Can buy Pencil");
        }
    }
}
