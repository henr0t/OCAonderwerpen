package com.company;

import com.company.other.*;

class Demo extends Demo2{

    public static void main(String[] args) {
        new A().whatever(50);

    }
}

class A{
    public String toString(){
        return "I am A, call me mr.this";
    }
    int x = 10;
    static int y = 20;
    final int z = 60;
    public void whatever(int z){
        int x = 30;
        int y = 40;
        System.out.println(this.x);
        System.out.println(x);
        System.out.println(A.y);
        System.out.println(y);
        System.out.println(this.z);
        System.out.println(z);

        System.out.println(this);
    }

    A(){
    this(3.0);
        System.out.println("constructor  2");
    }

    A(int x){
        super();
        System.out.println("constructor "+x);
    }

    A(double z){
        this(1);
        System.out.println("constructor "+z);
    }
}