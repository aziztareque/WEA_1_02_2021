package basic_First_Class;

import java.util.Scanner;

public class FirstJavaHomework {

    public static void main(String[] args) {
        int num1= 84;
        int num2= 35;
        int total = num1 + num2;

        System.out.println(total);

        //Write a Java program to divide two numbers and print on the screen.Test Data : 50/3 Expected Output : 16 *
    int number1= 50;
    int number2=3;
    int divide = number1/number2;
        System.out.println(divide);

        //Write a Java program that takes two numbers as input and display the product of .....
        // two numbers. Test Data:Input first number: 25 Input second number: 5 Expected Output : 25 x 5 = 125 *

        Scanner  obj = new Scanner(System.in);
        System.out.println("Input first number");
        int input1 = obj.nextInt();
        System.out.println("Input second number");
        int input2 = obj.nextInt();
        System.out.println(input1*input2);
    }
}
