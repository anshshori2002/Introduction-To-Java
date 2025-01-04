class Method
{
//     public static void main(String args[])
//     {
//         int a=56, b=90;
//         int sum = add(a,b);
//         System.out.println("Sum of a and b is: "+sum);
//     }
//     static int add(int a, int b)
//     {
//         return a+b;
//     }
// }
        public static void main(String args[])
        {
            int a = 12, b = 34;
            Method m = new Method();
            System.out.println("Sum of a and b is: "+m.sum(a,b));
        }
        int sum(int x, int y)
        {
            return x+y;
        }
}