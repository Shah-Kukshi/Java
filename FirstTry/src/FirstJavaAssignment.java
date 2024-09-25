import java.util.Scanner;

public class FirstJavaAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Write a program to print whether a number is even or odd, also take input from the user.
        /*
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num + " is Even");
        }
        else{
            System.out.print(num + " is odd");
        }
        */
        //Take name as input and print a greeting message for that particular name.
        /*
        System.out.print("Whats your name: ");
        String name =  input.nextLine();
        System.out.println("Welcome " + name);
        */
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        /*
        System.out.print("Enter principal , time and rate: ");
        String ptr = input.nextLine();
        String[] ptrParts = ptr.split(" ");
        float p = Integer.parseInt(ptrParts[0]);
        float t = Integer.parseInt(ptrParts[1]);
        float r = Integer.parseInt(ptrParts[2]);

        float SimpleInterest = (p*r*t)/100;
        System.out.println("Simple intertest for principal: " + p + " Time: " + t + " and Rate of Interest: " + r + " is: " + SimpleInterest);
        */
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        System.out.print("Enter numbers than operator: ");
        String calc = input.nextLine();
        String[] calcFinal = calc.split(" ");
        float num1 = Float.parseFloat(calcFinal[0]);
        String op = calcFinal[1];
        float num2 = Float.parseFloat(calcFinal[2]);

        if(op.equals("+")){
            System.out.println("Result: " + num1 + " " + op + " " +  num2 + " = " + (num1+num2));
        }
        else if(op.equals("-")){
            System.out.println("Result: " + num1 + " " + op + " " +  num2 + " = " + (num1-num2));
        } else if (op.equals("*")) {
            System.out.println("Result: " + num1 + " " + op + " " +  num2 + " = " + (num1*num2));
        } else if (op.equals("/")) {
            System.out.println("Result: " + num1 + " " + op + " " +  num2 + " = "+ (num1/num2));
        }else{
            System.out.println("Result: " + num1 + " " + op + " " +  num2 + " = " + (num1%num2));
        }
    }
}
