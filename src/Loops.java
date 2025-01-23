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
SumOfDigits(scanner);
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

        public static void SumOfDigits(Scanner scanner) {
            System.out.print("Enter a number: ");
            int upperLimit = scanner.nextInt();

            System.out.println("Number and Sum of Digits:");
            for (int number = 1; number <= upperLimit; number++) {
                int sum = 0;
                int temp = number;

                // Calculate the sum of digits for the current number
                while (temp > 0) {
                    sum += temp % 10; // Extract the last digit
                    temp /= 10;       // Remove the last digit
                }

                // Print the result
                System.out.println("Number: " + number + ", Sum of Digits: " + sum);
            }

        }

    }
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class ReverseLinkedList {
    // Function to reverse the linked list
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            // Save the next node
            next = current.next;

            // Reverse the link
            current.next = prev;

            // Move pointers one step forward
            prev = current;
            current = next;
        }

        // New head of the reversed list
        return prev;
    }

    // Helper function to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create the linked list: 1 → 2 → 3 → 4 → 5 → null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reverse the linked list
        ListNode reversedHead = reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversedHead);
    }
}

