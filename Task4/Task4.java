package Task4;

public class Task4 {
    public static void main(String[] args){
        // learning methods 
        /* 
        greet();
        int large = max(12,8);
        System.out.println(large);


        int x =10;
        increase(x);
        System.out.println(x);
        

        int[] scores = {10, 20, 30};
        values(scores);
        System.out.println(scores[0]);
        
       
        double val = mul(10.2);
        System.out.println(val);
        */

        // method overloading

        
    }

    /*
    accessModifier static returnType methodName(parameters) {
        // method body
    }
    */

    public static void greet(){
        System.out.println("Hello machan");
    }
    
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

        public static int increase(int number)
        {
            return number++;
        }

        public static void  values(int[] val)
        {
            val[0]= 99;
        }


        public static double mul(double number)
        {
            return number * number;    
        }
}   