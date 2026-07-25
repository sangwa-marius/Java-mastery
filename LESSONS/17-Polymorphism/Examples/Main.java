public class Main {
    public static void main(String[] args){
        Transport transport;
        transport = new Bus();
        transport.move();

        transport = new Train();
        transport.move();

        System.out.println(transport.getClass());
    }
}
