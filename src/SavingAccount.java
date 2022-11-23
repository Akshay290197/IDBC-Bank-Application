import java.util.Scanner;
public class SavingAccount
{
   private Long accountNumber;
   private String name;
   private String address;
   private Long aadharCardNumber;
   private double deposit;

   Scanner sc = new Scanner(System.in);

   public void openAccount()
   {

      System.out.println("Enter your name : ");
      name = sc.next();
      System.out.println("Enter your address : ");
      address = sc.next();
      System.out.println("Enter you aadhar card : ");
      aadharCardNumber = sc.nextLong();
   }

   public void displayAccount(double amount, long accountNumber, int year)
   {
      System.out.println("Name       : " + name);
      System.out.println("Address    : " + address);
      System.out.println("Aadhar No  : " + aadharCardNumber);
      System.out.println("Account No : " + accountNumber);
      System.out.println("Amount     : " + amount);
      System.out.println("year       : " + year);
   }
}
