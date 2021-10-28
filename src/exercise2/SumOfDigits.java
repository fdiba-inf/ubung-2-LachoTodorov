package exercise2;

import java.util.Scanner;

public class  SumOfDigits
{
    public static void main(String[] args)
    {
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();        
        int number2 = number1 % 10;
        int number3 = ((number1/10)%10);
        int number4 = ((number1/100));
        int sum = number2 + number3 + number4;
        System.out.println("Sum of digits: " + sum);
    }

}