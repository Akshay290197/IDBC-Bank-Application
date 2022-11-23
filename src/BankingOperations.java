import java.util.Scanner;
public class BankingOperations extends BankingFunctions {
    private double balance = 0;
    private double withdrawMoney;
    private double transferMoney;
    private double depositMoney;
    Scanner sc = new Scanner(System.in);
    // BankingOperations bo = new BankingOperations();

    // Balance Check
    public double balanceCheck(double deposit)
    {
        balance = balance + deposit;
            return balance;
    }


    // Money Transfer
    public void transfer(double money)
    {
        System.out.println("Amount transferred successful !!!! ");
        balanceCheck(-money);
    }

    // withdraw
    public void withdrawMoney(double money)
    {
        System.out.println("Amount withdraw successful : ");
        balanceCheck((-money));
    }

    public void deposit(double money)
    {
        System.out.println("Amount deposit successful : ");
        balanceCheck((money));
    }

    public void depositCheque(double money)
    {
        System.out.println("Acheque deposit successful : ");
        balanceCheck((money));
    }

}
