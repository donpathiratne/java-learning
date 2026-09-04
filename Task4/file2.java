package Task4;
public class file2{
    public static void main(String[] args){
    // method overloading
    System.err.println(add(10.2,12.63));
    
    // we can use same name for methods name, when they have different parameters
    }

    // method overloading 1 
    public static int add(int num1, int num2)
    {
        return num1+num2;
    }

    // method overloading 2
    public static double add(double num1, double num2)
    {
        return num1+num2;
    }

}