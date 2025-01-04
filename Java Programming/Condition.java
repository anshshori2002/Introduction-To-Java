import java.util.Scanner;
public class Condition
{
    public static void main(String args[])
    {
        // int password;
        // System.out.print("Enter Password: ");
        // Scanner sc = new Scanner(System.in);
        // password = sc.nextInt();

        // if(password == 2345)
        // {
        //     System.out.print("Showing Personal Details.");
        // }
        // else
        // {
        //     System.out.println("Sorry! Wrong Password...");
        // }

        //Get you Division
        // int marks;
        // System.out.print("Enter your marks: ");
        // Scanner obj = new Scanner(System.in);
        // marks = obj.nextInt();

        // if(marks>=60 && marks<=100)
        // {
        //     System.out.print("First Division");
        // }
        // else if(marks>=33 && marks<60)
        // {
        //     System.out.print("Second Division");
        // }
        // else
        // {
        //     System.out.print("failed...");
        // }

        //Find Maximum b/w 3 numbers
        int a=70, b=200, c=30;
        int res = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Maximum number is: "+res);
    }
}
