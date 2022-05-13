package com.company;

import java.util.Scanner;

public class Triengle {
    private int side1;
    private int side2;
    private int side3;
    Scanner sc = new Scanner(System.in);
    public Triengle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void triangleSum (){

    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triengle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
