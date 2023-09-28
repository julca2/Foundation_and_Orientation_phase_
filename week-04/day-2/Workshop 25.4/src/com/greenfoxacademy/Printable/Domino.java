package com.greenfoxacademy.Printable;

public class Domino implements Printable{
    int A;

    int B;

    public Domino(int a, int b) {
        A = a;
        B = b;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + A + ", B side: " + B);
    }
}
