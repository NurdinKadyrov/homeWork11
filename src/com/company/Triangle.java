package com.company;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void area(){
        System.out.println(a + b + c);
        System.out.println((a+b+c)/2);
    }
}
