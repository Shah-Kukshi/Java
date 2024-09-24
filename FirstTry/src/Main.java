import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Primitive data types:
        /*
        int num = 9;
        int letter = 'A';
        float flotNum = 9.3f;
        double doubleNum = 8457348.9842;
        long longInt = 73578347854356355L;
        boolean check = false;
        */
//        Literals and Identifiers
        int ident = 10; // ident = identifier and 10 = literals
        System.out.println("Identifier : ident And Literals: " + ident);
//        Millions ANd float Input
        /*
        int millions = 234_000_000;
        float marks = sc.nextFloat(); //it throws float error
        */
        //Sum
        /*
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum =  num1 + num2;
        System.out.println("Sum: " + sum);
        */

//        Type Converstion: Rules : 1) teo type should be compatible 2) destination should be grater than integer ex : float > int
//        float asked give num , machine automatically converts it in float eg 67 - 67.0

//        Type casting
        int num = (int)(65.87f);
        System.out.println(num);

//        automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a); //Range 0 - 256
        System.out.println(b); //257 % 256 =1

        byte num1 = 40;
        byte num2 = 50;
        byte num3 = 100;
        int res = (num1*num2)/num3; // here num1 , num2 , num3 are automatically converted in int . here num1 , num2 , num3 are counted as int only in expression
        System.out.println(res);

        int let = 'A';
        System.out.println((let));
    }
}