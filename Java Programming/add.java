import java.util.Scanner;

public class add
{
    public static void main(String args[])
    {
        int a, b, c;
        System.out.println("Enter Two Numbers: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        c = a+b;
        System.out.println("System of Two Numbers: "+c);
    }
}