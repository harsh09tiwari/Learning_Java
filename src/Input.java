import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        // How to take INPUT ?

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter ur age: ");
        int age = sc.nextInt();

        System.out.println("Enter ur name: ");
        String name = sc.next();   //  next  only take tokens means a single word as input.
        String name2 = sc.nextLine(); // take all the words in a line as a input
        System.out.println(name2);
    }
}
