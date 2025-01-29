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

