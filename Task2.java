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
/* 
question 2
 
Given:
int totalSeconds = 100000;

calculate and print the equivalent number of days, hours, minutes, and remaining seconds. Do not hardcode the expected values.
*/
int totalSeconds = 100000;
int numberOfDays = totalSeconds/86400;
int reminderOfDays = totalSeconds%86400;

int numberOfHours = reminderOfDays/3600;
int reminderOfHours = reminderOfDays%3600;

int numberOfMinutes = reminderOfHours/60;
int numberOfSeconds = reminderOfHours%60;

System.out.println("Days: "+numberOfDays+" Hours: "+numberOfHours+" Minutes: "+numberOfMinutes+" Seconds: "+numberOfSeconds);


/*question 3 
Predict the output before running this code, then explain why:

int x = 7;
int y = 2;

System.out.println(x / y); # 3
System.out.println((double) x / y); 3.5
System.out.println(x % y); #1
System.out.println("Result: " + x + y); #Result: 72
System.out.println("Result: " + (x + y));# Result: 9

*/
int x = 7;
int y = 2;

System.out.println(x / y); 
System.out.println((double) x / y);
System.out.println(x % y);
System.out.println("Result: " + x + y);
System.out.println("Result: " + (x + y));

/* question 4

Challenge: A person has lived for age years. 
Estimate how many heartbeats they have had, assuming 72 beats per minute. 
Use long, account for leap years approximately by using 365.25 days/year, 
and explain why converting between numeric types matters here.
*/

int personAge = 20;

double totalBeats = 72*60*24*365.25*personAge;

System.out.println("Total heart beats:");

    }
}



