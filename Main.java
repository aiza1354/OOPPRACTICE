import java.util.Scanner;

public class Main {
    public static void main(String [] args){
    /*    Person aiza = new Person("Aiza" , "female");
        System.out.println(aiza.introduceSelf());
        System.out.println(aiza.celebrateBirthday());
        System.out.println(aiza.celebrateBirthday());
        System.out.println(aiza.celebrateBirthday());
        System.out.println(aiza.celebrateBirthday());
        System.out.println(aiza.celebrateBirthday());
        System.out.println(aiza.celebrateBirthday());

        Person avika = new Person ("Avika" , "female");
        System.out.println(avika.introduceSelf());
        System.out.println(avika.celebrateBirthday());
        System.out.println(avika.celebrateBirthday());

        Car mycar = new Car ("Mercedes" , "snow" , 2025);
        mycar.accelerate();
        mycar.accelerate();
        mycar.accelerate();
        mycar.accelerate();
        mycar.accelerate();
        mycar.accelerate();
        mycar.brake();
        mycar.brake();
        mycar.brake();
        mycar.brake();
        mycar.brake();
        mycar.brake();
        mycar.brake();
        mycar.brake();*/

        BankAccount aizasBankAccount = new BankAccount(48329 , 1000);
        aizasBankAccount.checkBalance();

        System.out.println("Please enter an amount to be deposited.");
        Scanner scanner1 = new Scanner(System.in);
        int amountDeposited = scanner1.nextInt();
        aizasBankAccount.deposit(amountDeposited);
        aizasBankAccount.checkBalance();

        System.out.println("Please enter an amount to be withdrawn.");
        Scanner scanner2 = new Scanner(System.in);
        int amountWithdrawn = scanner2.nextInt();
        aizasBankAccount.withdraw(amountWithdrawn);
        aizasBankAccount.checkBalance();
    }
}
