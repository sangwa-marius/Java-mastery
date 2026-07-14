import java.util.Scanner;
public class NumberStatis {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter 5 integers:\n");
        int zeros=0, positives=0, negatives=0;

        for (int i =1; i<=5; i++){
            System.out.printf("Number %d: ",i);
            int value = input.nextInt();
            if(value == 0){
                zeros++;
            }else if( value < 0){
                negatives++;
            }else{
                positives++;
            }

        }

        System.out.println("\n===== Statistics =====");
        System.out.println("Positive Numbers : "+ positives);
        System.out.println("Negative Numbers : " + negatives);
        System.out.println("Zeros            : "+zeros);


        input.close();
    }
}
