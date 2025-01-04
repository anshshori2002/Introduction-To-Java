import java.util.Scanner;

public class Looping
{
    public static void main(String args[])
    {
        // int num;
        // System.out.print("Enter any number: ");
        // Scanner sc = new Scanner(System.in);
        // num = sc.nextInt();

        // for(int i=1; i<10; i++)
        // {
        //     System.out.println(num*i);
        // }

        // while(num>=0)
        // {
        //     if(num%2==0)
        //     {
        //         System.out.println("Even Number");
        //         break;
        //     }
        //     else{
        //         System.out.println("Odd Number");
        //         break;
        //     }
        // }
        // System.out.println("While Loop ended...");

        // do
        // {
        //     System.out.print(num+" ");
        //     num++;
        // }
        // while(num<=10);

        //Flow Control
        // for(int i=1; i<10; ++i)
        // {
        //     if(i==5)
        //         continue;
        //     System.out.print(i+" ");
        // }

        //Switch statement
        int choice=0;
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter your Choice: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        choice = sc.nextInt();
        int result = 0;

        switch(choice)
        {
            case 1: result = a+b;
                    System.out.print("Adition: "+ result);
                    break;
            case 2: result = a-b;
                    System.out.print("Subtraction: "+ result);
                    break;
            case 3: result = a*b;
                    System.out.print("Multiplication: "+ result);
                    break;
            case 4: result = a/b;
                    System.out.print("Division: "+ result);
                    break;
            default: System.out.print("Wrong Input");
        }
    }
}