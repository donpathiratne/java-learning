import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
    /*
    // conditional statements
    // if, else if, else

    double marks = 72;

    if (marks >= 75){
        System.out.println("Distinction");
    }
    else if(marks >= 65){
        System.out.println("Credit");
    }
    else if(marks >= 50){
        System.out.println("Pass");
    } 
    else{
        System.out.println("Fail");
    }


    int age = 21;
    boolean hasID = true;

    if(age >= 18 && hasID == true){
        System.out.println("Entry allowed.");
    }

    // with Strings use .equals()
    String role = "admin";

    if(role.equals("admin")){
        System.out.println("Administrator");
    }
    
    if("admin".equals(role)){
        System.out.println("Adminster");    // this is safer
    }

    // switch
    int day = 3;

    switch (day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            System.out.println("Otherday");
        
        }

    char grade = 'A';

    switch (grade){
        case 'A':
            System.out.println("Distinction");
            break;
        case 'B':
            System.out.println("Good");
            break;
        case 'c':
            System.out.println("Pass");
            break;
        default:
            System.out.println("Fail");
    }


    // new way to declare a switch
    int month = 2;

    String season = switch(month){
        case 12,1,2 -> "Winter";
        case 3,4,5 -> "Spring";
        case 6,7,8 -> "Summer";
        case 9,10,11 -> "Autumn";
        default -> "Invalid month";
    };

    System.out.println(season);
    // arrow form does not fall through.
    

    // Loops

    for(int i = 0; i<=5; i++){
        System.out.println(i);
    }

    int attemps = 0;
    while(attemps<5){
        System.out.println("Attemp:"+(attemps+1));
        attemps++;
    }

    // do-while

    int number = 0;

    do{
      System.out.println("Number: "+(number));
      number++;  
    }while(number<4);
    

    // break and continue
    for(int i= 0;i<20;i++)
        {   
            if(i%2==1){
                continue; // skip odd numbers
            }

            if(i==12)
                {
                    break; // if i equals 12, program will be stopped. 
                }
            System.out.println(i);

        }

        */
       /*
        // user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        */
        /* 
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

        System.out.println("Hello I am "+(name)+". I am "+(age)+" years old.");
        scanner.close();
        

        System.out.print("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        */

        // Practice 2
        /* 
        Write a grade evaluator. Read a mark from 0 to 100, reject invalid input, then print:
            - A: 75–100
            - B: 65–74
            - C: 55–64
            - S: 40–54
            - F: 0–39

            Add a second result: “Eligible for scholarship” only if the grade is A and attendance is at least 80%.
        */
        /*
        double mark;
        mark = 100;
        double attendance = 80;

        if(mark<=100 && mark>=75)
            {
                System.out.println("A");
                if(attendance> 80)
                    {
                        System.out.println("Eligible for scholarship");
                    }
            }
        else if(mark<75 && mark>=65)
            {
                System.out.println("B");
            }
        else if(mark<65 && mark>55)
            {
                System.out.println("A");
            }
        else if(mark<55 && mark>=40)
            {
                System.out.println("A");
            }
        else if(mark<40 && mark>=0)
            {
                System.out.println("F");
            }
        else{
            System.out.println("Invalid input");
        }
        */

        
        /*Build a menu-driven calculator using a do-while loop. 
        It must support addition, subtraction, multiplication, division, and exit. 
        Reject division by zero and invalid menu options. 
        Keep showing the menu until the user exits. */
        /* 
        boolean decision = true;
        do{
            Scanner scanner1 = new Scanner(System.in);

            System.out.print("Do you want to calculate or not?(Yes or No): ");
            String yesNo = scanner1.nextLine();
            if(yesNo.equalsIgnoreCase("yes")){

            }
            else if(yesNo.equalsIgnoreCase("no")){
                break;
            }
            else{
                continue;
            }

            double number1 = 0;
            // this is for getting a valid first number
            while(true){
            System.out.print("Enter first number: ");
            String num1 = scanner1.nextLine();
            try{
                number1 = Double.parseDouble(num1);
                break;
            }catch(NumberFormatException e){
                System.out.println("Invalid number");
                continue;
            }
        }

            // this is for getting a valid second number
            double number2 = 0;
            while(true){
            System.out.print("Enter second number: ");
            String num2 = scanner1.nextLine();
            try{
                number2 = Double.parseDouble(num2);
                break;
            }catch(NumberFormatException e){
                System.out.println("Invalid number");
                continue;
            } 
        }
            
            System.out.println("Select a option:");
            System.out.println("+ - addition");
            System.out.println("- - substraction" );
            System.out.println("/ - division");
            System.out.println("* - multiplication");
            System.out.println("e - exit");
            System.out.print("Your option : ");
            String option = scanner1.nextLine();
            
            switch (option){
                case "+":
                    System.out.print("You have selected addition.");
                    double total = ((number1) + (number2));
                    System.out.println("Total is " + total);
                    break;
                case "-":
                    System.out.print("You have selected sustraction.");
                    double different = number1 - number2;
                    System.out.println("Different is "+different);
                    break;
                case "/":
                    System.out.print("You have selected division.");
                    double division = number1 / number2;
                    System.out.println("Division is "+ division);
                    break;
                case "*":
                    System.out.print("You have selected multiplicaton.");
                    double mul = number1 * number2;
                    System.out.println("Multiplication is "+mul);
                    break;
                case "e":
                    System.out.print("You have selected exit.");
                    decision = false;
                    break;
                default:
                    System.out.println("Invalid...");
            }

        }while(decision);

        */

        // question 3 

        /*Read a positive integer n. 
        Print all numbers from 1 to n that are divisible by 3 or 5, 
        but not both. Also print their count and sum. 
        Reject non-positive n. */
        /* 
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(true){
        System.out.print("Enter a positive integer number: ");
        String num = scanner.nextLine();
            try{
                number = Integer.parseInt(num);
                break;
            }catch(NumberFormatException e){
                System.out.println("Invalid");
                continue;
            }}
            int count = 0;
            int total = 0;
            for(int i=1; i<=number; i++)
                {
                    if(i%3 == 0 && i%5 == 0)
                        {
                            continue;
                        }
                    else if(i%3 == 0 || i%5 == 0)
                        {
                            System.out.println("Number: "+ i);
                            count++;
                            total = total + number;
                        }
                    else{}
                }
            System.out.println("Count: "+count);
            System.out.println("Total :"+total);
            */

            
            

    }
}