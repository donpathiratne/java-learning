public class Task2{
    public static void main(String[] args){
    
    // Variables
    
    int age;    // int variable
    age = 19;
    System.out.println(age);
    
    double GPA = 3.75;  // double variable

    char grade = 'A' ;  // char variable

    boolean isPass =  true; // boolean variable
    
    String name = "Yehan";  // name variable

    long largePopulation = 80_000_000L;

    // operaters
    int a = 21;
    int b = 5;

    System.out.println("a + b = "+(a+b));
    System.out.println("a - b = "+(a-b));
    System.out.println("a * b = "+(a*b));
    System.out.println("a ÷ b = "+(a/b));
    System.out.println("a % b = "+(a%b));


    // Practice part 1
/* Q1 - Write a program that stores your name, age, university name, and 
    current GPA in variables, then prints a well-formatted student profile.*/

String Name = "Yehan Pathiratne";
int Age = 20;
String universityName = "IIT";
double currentGPA = 3.75;

System.out.println("Name: "+Name+"\nAge: "+Age+"\nUniversity: "+universityName+"\nGPA: "+currentGPA);
    }
}