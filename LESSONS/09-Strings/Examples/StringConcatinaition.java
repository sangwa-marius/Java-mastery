public class StringConcatinaition{
    public static void main(String[] args){
        //Order matters
        System.out.println(5 + 5 + "Java"); // 10 --> 10Java
        System.out.println("Java" + 5 + 5); // Java --> Java5 --> Java55
    }
}