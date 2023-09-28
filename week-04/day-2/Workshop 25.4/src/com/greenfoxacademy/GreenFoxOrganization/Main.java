package com.greenfoxacademy.GreenFoxOrganization;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       Student johny = new Student("John", 20, "male", "BME");;
        System.out.println(johny.toString());

        Student johnyTheClone = johny.clone();

        System.out.println(johnyTheClone.toString());









    }
}