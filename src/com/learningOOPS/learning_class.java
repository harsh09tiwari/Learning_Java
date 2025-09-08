package com.learningOOPS;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}


class Pencil{
    String color;
    int price;
}



class Student{
    String name;
    int age;
    String rollNo;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollNo);
    }
// NON-_Parameterised constructor
    Student(){
        System.out.println("constructor called");
    }


//    Parameterised constructor
//    Student(String name, int age, String rollNo){
//        this.name = name;
//        this.age = age;
//        this.rollNo = rollNo;
//    }

//    Copy Constructor
    Student(Student student2){
        this.name = student2.name;
        this.age = student2.age;
        this.rollNo = student2.rollNo;

    }
}


public class learning_class {
    public static void main(String[] args){
//        Pen pen1 = new Pen();
//        pen1.color = "blue";
//        pen1.type = "gel";
//
//        Pen pen2 = new Pen();
//        pen2.color = "black";
//        pen2.type = "ball";
//
//        pen1.write();
//        pen1.printColor();
//        pen2.printColor();


//        Student student1 = new Student("harsh", 21, "RA2211003030079");   // parameterised
        Student student1 = new Student();
        student1.name = "Harsh";
        student1.age = 21;
        student1.rollNo = "RA2211003030079";

        Student student2 = new Student(student1);
        student2.printInfo();



//        student1.printInfo();
    }
}
