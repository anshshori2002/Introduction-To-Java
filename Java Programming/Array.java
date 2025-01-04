import java.util.Arrays;
import java.util.Scanner;

class Array
{
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        // int a[] = {10, 20, 30, 40, 50};
        int a[] = new int[5];
        System.out.print("Enter Array Elements: ");
        Scanner s = new Scanner(System.in);

        for(int i=0; i<5; i++)
        {
            a[i] = s.nextInt();
        }

        // int i=0;
        // for(int c : a)
        // {
        //     c = s.nextInt();
        //     a[i] = c;
        //     i++;
        // }

        //Sorting
        Arrays.sort(a);
        System.out.println("Sorted Array Elements: ");
        for(int b : a)
        {
            System.out.print(b+" ");
        }
    }
}