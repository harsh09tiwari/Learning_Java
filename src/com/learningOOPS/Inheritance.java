package com.learningOOPS;

class Shape{
    public void area(){
        System.out.println("dispalys areas");
    }
}

//  Single level Inheritance  -- one Subclass
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

//  Multi level Inheritance  -- Subclass from drive from another Subclass
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

// Hierarchical Inheritance   -- Same base Class
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


public class Inheritance {
    public static void main(String[] args){
        EquilateralTriangle t1 = new EquilateralTriangle();
        t1.area(12,15);
        Circle c1 = new Circle();
        c1.area(10);

    }
}
