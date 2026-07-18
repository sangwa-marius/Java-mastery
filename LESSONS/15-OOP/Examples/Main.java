public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        Car car = new Car();
        Book book1 = new  Book("Lord the provider","Sangwa marius",23,22);
        Book book2 = new Book(
            "Seven steps to succes",
            "Rechard bont",
            34,
            34
        );

        account.accountNumber = "ACC-1001";
        account.ownerName = "John Doe";
        account.balance = 5000;

        account.deposit(1000);

        account.withdraw(250);

        account.displayInfo();

        car.accelerate(78);
        car.displayStatus();
        book1.displayInfo();
        book2.displayInfo();

    }

}