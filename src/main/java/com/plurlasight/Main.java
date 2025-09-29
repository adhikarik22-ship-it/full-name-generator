package com.plurlasight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name ");  // first name
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name ");  // last name
        String lastName = scanner.nextLine();

        System.out.println("Suffix (e.g., Jr, Sr, PhD,):  ");  // suffix
        String suffix = scanner.nextLine();

        String fullName;       // Fullname
        if (!suffix.isEmpty()) {fullName = firstName + " " + lastName + " ;  " + suffix;}
        else {fullName = firstName + " " + lastName;}

        // print full name

        System.out.println("Full name: " + fullName);



    }
}