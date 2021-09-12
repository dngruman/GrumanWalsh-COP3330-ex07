/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double length, width, area, SM;               //Declaring variables length, width, and area
        double Meter2 = 0.09290304;


        //User input and storing in variables
        System.out.print("What is the length of the room in feet? ");
        length =user_input.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        width = user_input.nextDouble();

        //Area calculations and conversion to square meters
        area = length * width;
        SM = area * Meter2;

        //Output to user
        System.out.println("You entered dimension of " +length+ " feet by " +width+ " feet.");
        System.out.printf("The area is \n" +area+ " square feet\n" +SM+ " square meter");
    }
}
