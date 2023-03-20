package com.malik.HelloNameProject.HelloNameProject;

public class MainClass {
    public static void main(String[] args){
        Bird bird1 = new Bird();
        bird1.name = "Eagle";
        bird1.color = "Brown";
        bird1.canFly = true;

        Bird bird2 = new Bird();
        bird2.name = "Penguin";
        bird2.color = "Black&White";
        bird2.canFly = false;
        System.out.println(bird1);
        System.out.println(bird2);

        Department dept1 = new Department();
        dept1.name = "Physics";
        dept1.address = "Hyd";

        Department dept2 = new Department();
        dept2.name = "Social";
        dept2.address = "Fremont";
        System.out.println(dept1);
        System.out.println(dept2);
    }

}
