package Tasks;

import java.util.Scanner;

public class Task_Triangle {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1: ");
        double side1 = sc.nextInt();
        System.out.println("Enter the side2: ");
        double side2 = sc.nextInt();
        System.out.println("Enter the side3: ");
            double side3 = sc.nextInt();
            if(side1==side2 && side2==side3 && side3 ==side1) {
                System.out.println("Equilateral");
                // all sides are equal
                // isosceles (exactly two sides are equal)
                // scalene (no sides are equal).
                // Use an if-else statement to classify the triangle.
            } else if(side1==side2 || side2==side3 || side3 ==side1){
                    System.out.println("Isosceles");
                }
                else {
                    System.out.println("Scalene");
                }
                }
        }

