public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        Car car = new Car();

        account.accountNumber = "ACC-1001";
        account.ownerName = "John Doe";
        account.balance = 5000;

        account.deposit(1000);

        account.withdraw(250);

        account.displayInfo();

        car.accelerate(78);
        car.displayStatus();

    }

}