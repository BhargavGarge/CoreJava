import java.util.Scanner;
public class DecisionStatement {
    public static void main(String[] args) {
        //if-else
//        int age=20;
//        if(age>=18){
//            System.out.println("Ready to vote");
//        }
//        else{
//            System.out.println("Not ready to vote");
//        }
//        //switch statement
//        int day = 3;
//        switch (day) {
//            case 1: System.out.println("Monday"); break;
//            case 2: System.out.println("Tuesday"); break;
//            default: System.out.println("Other day");
//        }

        //speed checker
        Scanner reader=new Scanner(System.in);

//        System.out.println("Welcome to Speed tracker, Enter your car speed please");
//
//        int speed = Integer.valueOf(scanner.nextLine());
//
//        if(speed >= 80){
//            System.out.println("Watch out you are over speeding");
//        }
//        else{
//            System.out.println("Good Driving !!!");
//        }

//Write a program that prompts the user for a year. If the user inputs a number that is smaller than 2015, then the program prints the string "Ancient history!".

//        System.out.println("Check whether it is ancient history or not");
//
//        int year=Integer.valueOf(scanner.nextLine());
//
//        if(year >2015){
//            System.out.println("Not ancient");
//        }
//        else{
//            System.out.println("Ancient!!");
//        }

        //Write a program that prompts the user for two integers and prints the larger of the two. If the numbers are the same, then the program informs us about this as well.


//        System.out.println("Write first number");
//
//        int num1=Integer.valueOf(scanner.nextLine());
//
//
//        System.out.println("Write second number");
//
//        int num2=Integer.valueOf(scanner.nextLine());
//
//
//        if(num1==num2){
//            System.out.println("both same");
//        } else if (num1 >num2) {
//            System.out.println(num1 + " is bigger");
//        } else if (num1<num2) {
//            System.out.println(num1 +" is smaller");
//        }

        //Write a program that prompts the user for a number and informs us whether it is even or odd.

//        System.out.println("enter number");
//
//        int num =Integer.valueOf(scanner.nextLine());
//
//        if(num %2 ==0){
//            System.out.println(num +" is even");
//        }
//        else{
//            System.out.println("not even");
//        }
//Write a program that prompts the user for a password. If the password is "Caput Draconis" the program prints "Welcome!". Otherwise, the program prints "Off with you!"

        System.out.println("Please enter your passowrd");

        String pass = reader.nextLine();

        if(pass.equals("Caput Draconis")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Fuck off");
        }
    }
}
