//Learning About variables
import java.util.Scanner;

//Variables are containers for storing data values. Each variable has a type,
//which determines the size and layout of the variable's memory.
public class Main {


    int instanceVaribale = 50;

    
    //Instance Variables: Declared outside methods but inside a class; they belong to an object
    static int staticvariable=100;
    //Static Variables: Declared using the static keyword; shared among all objects of a class
    public static void main(String[] args) {


        int a=10;
        //Local Variables: Declared inside a method and are accessible only within that method.
        System.out.println(a);

        //Literals
        //Literals are constant values assigned to variables.


        //Types:
        //Integer literals: 10, 0xA (Hex), 010 (Octal)
        //Floating-point literals: 10.5, 2.1E5
        //Boolean literals: true, false
        //Character literals: 'A', '\u0041'
        //String literals: "Hello"

        int c = 010;
        int b = 0xA;
        System.out.println(a + c);

        //operators
        //Relational:-Used to compare two values.
        int d=10;
        int e =20;
        System.out.println(d<e);
        System.out.println(d>e);

Scanner scanner=new Scanner(System.in);
//        System.out.println("Greetings! How are you doing");
//
//        String message1=scanner.nextLine();
//
//        System.out.println("Oh, how interesting. Tell More");
//
//        String message2=scanner.nextLine();
//
//
//        System.out.println("Thanks for sharing ");
//
//        System.out.println(message1);
//        System.out.println(message2);

//convert string to integer

//        String no="10";
//        int val=Integer.valueOf(no);
//        System.out.println(val);

//     sum of two number
        System.out.println("Write 1st number");
        int val1=Integer.valueOf(scanner.nextLine());
        System.out.println("Write 2nd number");
        int val2=Integer.valueOf(scanner.nextLine());

        int result = val1 + val2;

        System.out.println("Your sum is " + result);
        int dividend = 3;
        int divisor = 2;

        double k = dividend / divisor * 1.0;
        System.out.println(k);


        //Write a program that asks the user for two numbers and prints their sum, difference, product, and quotient.

        System.out.println("Write 1st number");
        int val3=Integer.valueOf(scanner.nextLine());
        System.out.println("Write 2nd number");
        int val4=Integer.valueOf(scanner.nextLine());

        int result1= val3+val4;
        int result2= val3-val4;
        int result3= val3*val4;
        int result4= val3/val4;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);



        class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    String add(String a, String b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the add method with different arguments
        System.out.println("Sum of 2 integers: " + calculator.add(10, 20)); // Calls add(int, int)
        System.out.println("Sum of 3 integers: " + calculator.add(10, 20, 30)); // Calls add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calculator.add(5.5, 7.3)); // Calls add(double, double)
        System.out.println("Concatenation of strings: " + calculator.add("Hello, ", "World!")); // Calls add(String, String)
    }
}

    }
}
// Parent class
class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (Dog) inherits from Animal
class Dog extends Animal {
    // Overriding the sound() method in the child class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child class (Cat) inherits from Animal
class Cat extends Animal {
    // Overriding the sound() method in the child class
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the overridden methods (polymorphism in action)
        myDog.sound();  // Output: Dog barks
        myCat.sound();  // Output: Cat meows
    }
}

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Student Grade Calculator");
        System.out.println("----------------------");
        
        // Get student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        // Get marks for three subjects
        System.out.print("Enter marks for Math (out of 100): ");
        int mathMarks = scanner.nextInt();
        
        System.out.print("Enter marks for Science (out of 100): ");
        int scienceMarks = scanner.nextInt();
        
        System.out.print("Enter marks for English (out of 100): ");
        int englishMarks = scanner.nextInt();
        
        // Calculate total and average
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double averageMarks = totalMarks / 3.0;
        
        // Calculate grade
        char grade;
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display results
        System.out.println("\nStudent Report");
        System.out.println("---------------");
        System.out.println("Name: " + name);
        System.out.println("Math: " + mathMarks);
        System.out.println("Science: " + scienceMarks);
        System.out.println("English: " + englishMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Marks: %.2f\n", averageMarks);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
// First interface
interface Animal {
    void eat();
}

// Second interface
interface Sound {
    void makeSound();
}

// Class implementing both interfaces
class Dog implements Animal, Sound {
    public void eat() {
        System.out.println("Dog eats food.");
    }

    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.makeSound();
    }
}

// Abstract class
abstract class Vehicle {
    abstract void start(); // Abstract method (no body)
    
    void stop() { // Concrete method
        System.out.println("Vehicle is stopping...");
    }
}

// Concrete class Car extending Vehicle
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

// Concrete class Bike extending Vehicle
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Output: Car starts with a key.
        myCar.stop();  // Output: Vehicle is stopping...

        Vehicle myBike = new Bike();
        myBike.start(); // Output: Bike starts with a self-start button.
        myBike.stop();  // Output: Vehicle is stopping...
    }
}
import java.sql.*;

public class SimpleJDBC {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";

        // JDBC variables
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // Create a statement object
            stmt = conn.createStatement();

            // Create table (if not exists)
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), email VARCHAR(50))";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table checked/created successfully.");

            // Insert data
            String insertSQL = "INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com')";
            stmt.executeUpdate(insertSQL);
            System.out.println("Data inserted successfully.");

            // Retrieve data
            String selectSQL = "SELECT * FROM users";
            rs = stmt.executeQuery(selectSQL);

            // Display results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
