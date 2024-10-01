import java.util.ArrayList;
import java.util.Arrays;
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
        /*
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
        */
        //Take 2 numbers as input and print the largest number
        /*
        System.out.print("Enter two numbers: ");
        String nums2 = input.nextLine();
        String[] nums2Final = nums2.split(" ");
        int num1 = Integer.parseInt(nums2Final[0]);
        int num2 = Integer.parseInt(nums2Final[1]);
        if(num1 > num2){
            System.out.println(num1 + " is greater than " +  num2);
        } else if (num1 == num2) {
            System.out.println("Both numbers are same");
        } else {
            System.out.println(num2 + " is greater than " +  num1);
        }

         */
        //Input currency in rupees and output in USD.
        /*
        System.out.print("Currency in rupees: ");
        String cur = input.nextLine();
        int curRupees = Integer.parseInt(cur);
        float curUSD = (float) (curRupees * 0.012);

        System.out.println("Rupees: " + curRupees + " USD: " + curUSD);

         */
        //To calculate Fibonacci Series up to n numbers.
        /*
        System.out.print("Upto how many numbers: ");
        int n = input.nextInt();
        ArrayList<Integer> fiboArrayList=  new ArrayList<Integer>(Arrays.asList(0,1));
        for(int i=0;i<(n-2);i++){
            int res= fiboArrayList.get(i) +fiboArrayList.get(i+1);
            fiboArrayList.add(res);
        }
        System.out.println(fiboArrayList);

         */
        //To find out whether the given String is Palindrome or not.
        /*
        System.out.print("Enter a word: ");
        String pali = input.nextLine();
        String[] paliFinal = pali.split("");
        System.out.println(Arrays.toString(paliFinal));
        int len = paliFinal.length;
        boolean flag = true;
        for (int i=0;i<(len/2);i++){
            if(!paliFinal[i].equals(paliFinal[len-1-i])){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

         */
        //To find Armstrong Number between two given number.
        System.out.print("Enter number: ");
        String charnum = input.nextLine();
        int num = Integer.parseInt(charnum);
        int len = charnum.length();
        int ori = num;
        double sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, len);
            num /= 10;
        }
        System.out.println(sum + " " + ori);
        if (sum == ori) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

}
