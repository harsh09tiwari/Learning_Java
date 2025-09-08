package com.learningOOPS;

public class car {
    public void fullThrottle(){
        System.out.println("Press the full Throttle");
    }

    public void speed(int speed){
        System.out.println("Speed is around " + speed + " km per hour");
    }


    public static void main(String[] args){
        car myCar = new car();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
