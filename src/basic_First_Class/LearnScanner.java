package basic_First_Class;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {

        //Class name is Scanner
        //How to create an object of Scanner class?
        //==ClassName objectName = new constructorOfClass();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("My first name is " + firstName);
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("my last name is "+ lastName);

        // tp close Scanner
        input.close();
        
    }
}
