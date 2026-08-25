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
    */  

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


    }
}