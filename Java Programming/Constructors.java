class A
{
    // int a, b;
    // String c;
    // A()//Default by not initialise with our values it initialize with 0 or null.
    // {
    //     a=12;
    //     b=100;
    //     c="Ansh";
    // }
    // A(int x, int y, String z) //Parametrised Constructor 
    // {
    //     a = x;
    //     b = y;
    //     c = z;
    // }

    //Copy Constructor
    int a;
    String b;
    A()
    {
        int a=13; String b = "crypto";
        System.out.println(a+" "+b);
    }
    A(A ref)
    {   
        a = ref.a;
        b = ref.b;
        System.out.println(a+" "+b);
    }
    // void display()
    // {
    //     System.out.println(a+" "+b+" "+c);
    // }
}
class Constructors
{
    public static void main(String args[])
    {
        // A a = new A(90, 89, "abc");
        // a.display();
        A a = new A();
        A a2 = new A(a);
    }
}