import java.util.Scanner;
class Bank
{
    private double bal = 5000.0;
    private int pwd;

    public void deposite(double amt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        pwd = sc.nextInt();
        if(pwd == 123)
        {
            bal += amt;
            System.out.println("Deposite Money:" + amt);
            System.out.println("Balance: "+bal);
        }
        else
        {
            System.out.println("Invalid Password...");
        }
    }
    public void withdraw(double amt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        pwd = sc.nextInt();
        if(pwd == 123)
        {
            if(bal >= amt)
            {
                bal -= amt;
                System.out.println("Withdraw Money:" + amt);
                System.out.println("Balance" + bal);
            }
            else
            {
                System.out.println("Insufficient Balance...");
            }
        }
        else
        {
            System.out.println("Invalid Password...");
        }
    }

    public void checkBalance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        pwd = sc.nextInt();
        if(pwd == 123)
        {
            System.out.println("Current Balance: " + bal);
        }
        else
        {
            System.out.println("Invalid Password...");
        }
    }
}

class BankCustomer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        System.out.println("1. Deposite Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        int ch;
        do
        {
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter amount to deposite: ");
                    double amt = sc.nextDouble();
                    b.deposite(amt);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    amt = sc.nextDouble();
                    b.withdraw(amt);
                    break;
                case 3:
                    b.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you...");
                    break;
                default:
                    System.out.println("Invalid Choice...");
            }
        }while(ch != 4);
    }
}

/* 
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        System.out.println("Enter Password to use Banking Services: ");
        int pwd = sc.nextInt();
        boolean Flag = true;
        if(pwd == 123)
        {
            while(Flag)
            {
                System.out.println("Choose from below Option: ");
                System.out.println("1. Deposite Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("Enter your Response from 1-4: ");
                int ch = sc.nextInt();
                double amt;
                switch(ch)
                {
                    case 1: System.out.println("Enter amount to Deposite: ");
                            amt = sc.nextDouble();
                            b.Deposite(amt);
                            break;
                    case 2: System.out.println("Enter amount to Withdraw: ");
                            amt = sc.nextDouble();
                            b.Withdraw(amt);
                            break;
                    case 3: b.checkbal();
                            break;  
                    case 4: Flag = false;
                            break;
                    default: System.out.println("Incorrect Choice...");
                }
                
            }
        }
        else
        {
            System.out.println("Incorrect Password...");
        }
        
    }
}
class Bank
{
    private double bal = 5000.0;
    private int pwd = 123;
    
    public void Deposite(double amt)
    {
        bal += amt;
        System.out.println("Deposite Amount: "+ amt);
        System.out.println("Updated Balance: "+ bal);
    }
    public void Withdraw(double amt)
    {
        bal -= amt;
        System.out.println("Withdraw Amount: "+ amt);
        System.out.println("Updated Balance: "+ bal);
    }
    public void checkbal()
    {
        System.out.println("Balance: "+ bal);
    }
}
    */