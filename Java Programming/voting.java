import java.util.Scanner;
class voting
{
    public static void main(String args[])
    {
        int age;
        System.out.print("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>=18)
        {
            System.out.print("You are Eligible for Voting.");
        }
        else
        {
            System.out.print("Sorry!! You are not Eligible for Voting..");
        }
    }
}