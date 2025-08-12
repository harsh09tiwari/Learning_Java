import java.util.Arrays;   //  including packagges

public class Data_Types {
    public static void main(String[] args){


        //   Primitive
        byte age = 12;   // size -   1 byte
        int phone = 1234567890;  // 4 bytes
        long phone2 = 123345565453L;  // 8 bytes
        float pi = 3.14F;   // 4 bytes
        boolean isHarsh = true; // 1 byte
        char lol = 'a';  // 2 bytes
        double pi2 = 3.1452434D; //  8 bytes



        //  Non-primitive types


        //  1 - STRING
        String name = "Harsh";
        String friend = new String("Akku");

//        System.out.println(name.charAt(0));
//        System.out.println(name.length());
//        System.out.println(name);

        // replace
        String name2 = name.replace('a', 's');
//        System.out.println(name2);

        // substring
//        System.out.println(name.substring(0,3));


        //   2 - ARRAYS

//        int[] marks = new int[3];
//        marks[0] = 94;
//        marks[1] = 87;
//        marks[2] = 45;

        //   another method

        int[] marks = {94, 87, 45};  // 1-D Arrays

        //   sorting the Array , here Arrays is class
        Arrays.sort(marks);

//        for(int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }


        int[][] finalMarks = {{94, 95, 45}, {98, 34, 64}};   //  2-D Arrays
//        System.out.println(finalMarks[0][0]);



//        Casting
        // 1->   Implicit Casting
        int price = 100;
        double finalPrice = price + 18.18;

        System.out.println(finalPrice);

        // 2-> Explicit Casting
        int p = 100;
        int fP = p + (int)18.98;
        System.out.println(fP);

    }
}
