import java.util.Scanner;
abstract class BankingFunctions implements calculateInterest
{
    Scanner sc = new Scanner(System.in);
    abstract double balanceCheck(double balance);
    abstract void transfer(double money);
    abstract void withdrawMoney(double money);
    abstract void deposit(double money);
    abstract void depositCheque(double money);
    // interface implementation
    public double interestCalc(double balance)
    {
        double interest = ((balance*2.5)/100);
        return interest;
    }
}
