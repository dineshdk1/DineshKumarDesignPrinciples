package com.epam;
import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {

        Operator operationObject = new Operator();


        Scanner inputt = new Scanner(System.in);
        double userInput1,userInput2;
        int userChoice;

        System.out.print("Please Enter The First Number: ");
        userInput1 = inputt.nextDouble();
        System.out.print("Please Enter The Second Number: ");
        userInput2 = inputt.nextDouble();
        System.out.println("Please Select Operation to Perform:");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Division");
        System.out.println("4-Multiplication");
        userChoice = inputt.nextInt();
      
        switch (userChoice){
        case 1:
        	System.out.println(operationObject.addition(userInput1, userInput2));
        	break;
        case 2:
        	System.out.println(operationObject.subtraction(userInput1, userInput2));
            break;
        case 3:
        	System.out.println(operationObject.division(userInput1, userInput2));
            break;
        case 4:
        	System.out.println(operationObject.multiplication(userInput1, userInput2));
            break;
        }
        

    }

}