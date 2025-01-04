// import java.util.*;
// class Test
// {
//         public static void main(String[] args)
//         {
//             Scanner sc = new Scanner(System.in);
//             String str = sc.nextLine(); 
//             char ch = sc.next().charAt(0);

//             for(int i=0; i<str.length(); i++)
//             {
//                 if(str.charAt(i)==ch)
//                 {
//                     System.out.println(i);
//                     break;
//                 }
//             }
//         }
// }

import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // int count = 0;
        // for(int i=0; i< str.length(); i++)
        // {
        //     char ch = str.charAt(i);
        //     if(ch>='a' && ch<='z')
        //     {
        //         count++;
        //     }
        // }
        // System.out.println(count);

        String temp = "";
        for(int i=0; i<str.length(); i++)
        {
            if(temp.indexOf(str.charAt(i)) == -1)
            {
                temp += str.charAt(i);
            }
        }
        System.out.println(temp);

    }
}