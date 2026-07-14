public class ParameterDemo {

    public static void greet(String name){
        System.out.println("How are you " + name);
    }

    public static void printSquare(int number){
        System.out.println(number*number);
    }

    public static void displayStudent(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void printRectangle(int width, int length){
        System.out.printf("The rectangle is %d units wide and %d units long",width, length);
    }

    public static void main(String[] args){
        greet("Sangwa Marius");
        printSquare(8);
        displayStudent("Marius", 18);
        printRectangle(34,65);
    }
    

}