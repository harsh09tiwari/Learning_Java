package Basics;

public class Try_catch {
    public static void main(String[] args) {
        // TRY-CATCH in EXCEPTION HANDLING
        int[] marks = {99, 95, 93};
        try{
            System.out.println(marks[5]);
        }catch (Exception exception){
            //  do something after catching
        }
        System.out.println("The name is harsh");
    }
}
