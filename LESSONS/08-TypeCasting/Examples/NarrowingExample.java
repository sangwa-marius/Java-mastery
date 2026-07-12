public class NarrowingExample{
    public static void main(String[] args){
        double marks = 9900033.00;
        int IntegerMarks = (int) marks; // data is lost
        System.out.println(IntegerMarks); // 99
    }
}