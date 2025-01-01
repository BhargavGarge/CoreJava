//class is the blueprint or template for object, it defines properties and methods that its object will have

//object is instance of class, Objects have state (data) and behavior(methods)
class Car{
    String brand;
    String color;
    int speed;

    // Constructor to initialize the car's attributes
    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }


    void displayDetails(){
        System.out.println("Brand: " + brand + ", Color: " + color + ", Speed: " + speed + " km/h");
    }
    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " accelerated. New speed: " + speed + " km/h");
    }

    // Method to apply brakes
    void applyBrakes(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0; // Speed can't be negative
        System.out.println(brand + " slowed down. New speed: " + speed + " km/h");
    }

}

class Student{
    String name;
    int rollNumber;
    int marks;

    Student(String name,int rollNumber,int marks){
        this.marks=marks;
        this.rollNumber=rollNumber;
        this.name=name;
    }

    void StudentDetails(){
        System.out.println("Student name: " + name + ", Student marks: " + marks + ", Student Roll No. : " + rollNumber );
    }

    void ifStudentPass(){
        if(marks>=40){
            System.out.println("Student Pass");
        }
        else{
            System.out.println("Student Fail");
        }


    }
}

class  BankAccount{
    int accountNumber;
    String accountHolderName;
    int balance;
    BankAccount(int accountNumber,int balance,String accountHolderName){
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
    }

    void increaseBalance(int depositMoney){
        balance+=depositMoney;
        System.out.println("A/c Name" + accountHolderName+" New Balance: " + balance );

    }
    void withDrawMoney(int withDraw){
        balance-=withDraw;
        if(balance<=0) balance=0;
        System.out.println("A/c Name" +  accountHolderName +" Withdraw Money: " + balance);
    }
    void AcDetails(){
        System.out.println("A/c name: " + accountHolderName + ", balance: " + balance + ",.A/c No. : " + accountNumber );

    }
}

public class ClassAndObject {
    public static void main(String[] args) {
//        Create objects (instances) of the Car class
        Car car1 = new Car("Toyota", "Red", 120);
        Car car2 = new Car("Honda", "Blue", 90);
        car1.displayDetails();
        car2.displayDetails();
        car1.accelerate(20);  // Increase speed by 20
        car1.applyBrakes(50); // Decrease speed by 50

        // Perform actions on car2
        car2.accelerate(10);  // Increase speed by 10
        car2.applyBrakes(30); // Decrease speed by 30

//        Create objects (instances) of the Student class

        Student s1=new Student("John",23,40);

        s1.StudentDetails();
        s1.ifStudentPass();

        //Bank instance

        BankAccount b1 =new BankAccount(23456789,2444,"Thomas");
        b1.AcDetails();
        b1.increaseBalance(40);
        b1.withDrawMoney(484);



    }


}
