public class Task3{
    public static void main(String[] args){

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
    }
}