public class MethodOverloading {

    /*
    Java overloads methods based on:

✅ Number of parameters
✅ Types of parameters
✅ Order of parameters

Not based on:

❌ Return type
❌ Method name alone
    */

    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static long add(long a, long b){
        return a + b;
    }

    public static float add(float a, float b){
        return a + b;
    }

    public static void main(String[] args){

        // code
    }
}