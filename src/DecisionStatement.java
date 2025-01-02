import java.util.Scanner;

public class DecisionStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uncomment any method call to test specific functionality

         checkVotingEligibility(scanner);
         dayOfWeek(3); // Example: 3 for Wednesday
         speedChecker(scanner);
         checkAncientHistory(scanner);
         findLargerNumber(scanner);
         checkEvenOrOdd(scanner);
         passwordCheck(scanner);
         calculateSquare(scanner);
         sumFiveNumbers(scanner);
         countInputValues(scanner);
         countNegativeValues(scanner);
        calculateSum(scanner);

        scanner.close(); // Close the scanner
    }

    // Method to check voting eligibility
    public static void checkVotingEligibility(Scanner scanner) {
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Ready to vote");
        } else {
            System.out.println("Not ready to vote");
        }
    }

    // Method to determine the day of the week
    public static void dayOfWeek(int day) {
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }

    // Method to check car speed
    public static void speedChecker(Scanner scanner) {
        System.out.println("Enter your car speed:");
        int speed = scanner.nextInt();
        if (speed >= 80) {
            System.out.println("Watch out! You are overspeeding.");
        } else {
            System.out.println("Good driving!");
        }
    }

    // Method to check if the year is ancient history
    public static void checkAncientHistory(Scanner scanner) {
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        if (year < 2015) {
            System.out.println("Ancient history!");
        } else {
            System.out.println("Not ancient.");
        }
    }

    // Method to find the larger of two numbers
    public static void findLargerNumber(Scanner scanner) {
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Both numbers are the same.");
        } else if (num1 > num2) {
            System.out.println(num1 + " is larger.");
        } else {
            System.out.println(num2 + " is larger.");
        }
    }

    // Method to check if a number is even or odd
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    // Method to check a password
    public static void passwordCheck(Scanner scanner) {
        System.out.println("Enter the password:");
        scanner.nextLine(); // Consume newline
        String password = scanner.nextLine();

        if ("Caput Draconis".equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }

    // Method to calculate the square of a number
    public static void calculateSquare(Scanner scanner) {
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println("The square of " + num + " is " + (num * num));
    }

    // Method to sum five numbers
    public static void sumFiveNumbers(Scanner scanner) {
        int sum = 0;
        int count = 0;

        while (count < 5) {
            System.out.println("Enter a number:");
            sum += scanner.nextInt();
            count++;
        }

        System.out.println("The sum of the five numbers is " + sum);
    }

    // Method to count input values until 0
    public static void countInputValues(Scanner scanner) {
        int count = 0;

        while (true) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            count++;
        }

        System.out.println("Total numbers entered (excluding 0): " + count);
    }

    // Method to count negative values until 0
    public static void countNegativeValues(Scanner scanner) {
        int count = 0;

        while (true) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            if (num < 0) {
                count++;
            }
        }

        System.out.println("Total negative numbers: " + count);
    }

    // Method to calculate the sum of numbers until 0
    public static void calculateSum(Scanner scanner) {
        int sum = 0;

        while (true) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            sum += num;
        }

        System.out.println("The total sum is " + sum);
    }
}
