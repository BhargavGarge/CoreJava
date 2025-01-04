import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uncomment the function you want to execute
        // Print numbers from 0 to a number given by the user
        // PrintNumByUser(scanner);

        // Print integers between two numbers given by the user
        // TwoPartEx(scanner);

        // Calculate the sum of numbers from 1 to n
        // SumSequence(scanner);

        // Calculate the sum of numbers between two user-given numbers
        // FirstLastSum(scanner);

        // Calculate the factorial of a number
        Factorial(scanner);
        //Palindrome
        Palindrome(scanner);

        scanner.close();
    }

    /**
     * Prints numbers from 0 to a number provided by the user.
     * Assumes the user enters a positive number.
     */
    public static void PrintNumByUser(Scanner scanner) {
        System.out.println("Enter the number:");
        int enteredNum = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= enteredNum; i++) {
            System.out.println(i);
        }
    }

    /**
     * Prints integers between two numbers provided by the user.
     * The user specifies the starting and ending points.
     */
    public static void TwoPartEx(Scanner scanner) {
        System.out.println("Where to?");
        int whereTo = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int whereFrom = Integer.valueOf(scanner.nextLine());

        for (int i = whereFrom; i <= whereTo; i++) {
            System.out.println(i);
        }
    }

    /**
     * Calculates the sum of numbers from 1 to n.
     * n is provided by the user.
     */
    public static void SumSequence(Scanner scanner) {
        System.out.println("Enter the number:");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);
    }

    /**
     * Calculates the sum of numbers between two user-provided numbers (inclusive).
     * Assumes the user enters the smaller number first.
     */
    public static void FirstLastSum(Scanner scanner) {
        System.out.println("Enter the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the last number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);
    }

    /**
     * Calculates the factorial of a number given by the user.
     * Factorial of n is the product of all integers from 1 to n.
     */
    public static void Factorial(Scanner scanner) {
        System.out.println("Enter the number to find factorial:");
        int num = Integer.valueOf(scanner.nextLine());
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
    public static void Palindrome(Scanner scanner) {
        System.out.println("Enter a string to check if it's a palindrome:");
        String str = scanner.nextLine(); // Take input from user
        boolean isPalindrome = true;

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
