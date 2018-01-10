package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String password = "bacon";
        System.out.println("Enter your password");
        Scanner sc = new Scanner (System.in);
        String enteredPassword;
        enteredPassword = sc.nextLine ();
        if (enteredPassword.equals (password)) {
            System.out.println("Gained access");
           } else
            System.out.println("Bzzzz! WRONG!");
        }
