package com.learningOOPS;
// polymorphism - 2 types
//                  Compile time polymorphism
//                  Run time polymorphism


//      Compile time Polymorphism aka  Function Overloading
//    in this different functions have same name but their work is different.



class Students {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String[] args){
        Students s1 = new Students();
        s1.name = "Harsh";
        s1.age = 21;

        s1.printInfo(s1.age);
    }
}



//Rules for polymorphism

//  every function must have one differentiating factor, it can be different arguments or different number of arguments or may be the return type

