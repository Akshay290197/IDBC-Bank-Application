import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        double deposit = 0;

        //Object creation
        SavingAccount sa = new SavingAccount();
        AccountNumber A = new AccountNumber();
        PayAccount P = new PayAccount();
        BankingOperations b = new BankingOperations();

        //IDBC banking services
        System.out.println("Welcome to IDBC banking services : ");
        System.out.println("Please select the below account type which you want to open : ");
        System.out.println("1.  Saving Account");
        System.out.println("2.  pay Account");

        // taking input from user
        int UI = sc.nextInt();

        //taking age of user
        System.out.println("Enter you age : ");
        int age = sc.nextInt();

        // checking user input
        if (UI == 1 && age > 18) {
            System.out.println("Please enter the necessary details mention below : ");
            sa.openAccount();

            System.out.println("Enter the amount for deposit : ");
            deposit = sc.nextDouble();
            b.balanceCheck((deposit));
            System.out.println("Enter the current year ");
            year = sc.nextInt();
            sa.displayAccount(deposit,A.accNo, year );
        }
        else if (UI == 2 && age > 18)
        {
            System.out.println("Please enter the necessary details mention below : ");
            P.payAccountOpen();
            System.out.println("Enter the amount for deposit : ");
            deposit = sc.nextDouble();
            b.balanceCheck((deposit));
            System.out.println("Enter the current year ");
            year = sc.nextInt();
            P.displayAccount(deposit,A.accNo, year);
        }
        else
        {
            System.out.println("you are not eligible for account : ");
        }


        // uses additional features of banking services
        if(age>18) {
            System.out.println("Enter the current year : ) ");
            int y = sc.nextInt();
            if(y == year+1)
            {
                double interest = b.interestCalc(deposit);
                b.balanceCheck(interest);
            }
            int det;
            do {
                System.out.println("please enter the below features for accessing these facilities : ");
                System.out.println("1. Balance check");
                System.out.println("2. Money Transfer");
                System.out.println("3. Withdraw");
                System.out.println("4. Deposit money");
                System.out.println("5. Deposit cheque");
                System.out.println("6. Exit");
                det = sc.nextInt();

                // switch case for accesing data which user has entered
                switch (det) {
                    case 1: {
                        System.out.println("Available balance is : " + b.balanceCheck(0));
                        break;
                    }
                    case 2: {
                        System.out.println("enter the amount for money transfer");
                        int tr = sc.nextInt();
                        b.transfer(tr);
                        break;
                    }
                    case 3: {
                        System.out.println("enter the amount for withdraw");
                        int wd = sc.nextInt();
                        b.withdrawMoney(wd);
                        break;
                    }
                    case 4: {
                        System.out.println("enter the amount for deposit in your account");
                        int d = sc.nextInt();
                        b.deposit(d);
                        break;
                    }
                    case 5: {
                        System.out.println("enter the amount of cheque");
                        int ch = sc.nextInt();
                        b.depositCheque(ch);
                        break;
                    }
                }
            } while (det != 6);
        }
    }
}
