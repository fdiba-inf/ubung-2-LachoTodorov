package exercise2;

import java.util.Scanner;

public class circle
{
    public static void main(String[] args) 
    {
      System.out.println("Enter r: ");
      Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        double C = 2*Math.PI*R;
        double A = Math.PI*R*R;
        System.out.println("Circumference: "  + C);
        System.out.println("Area: " + A);
    }
}