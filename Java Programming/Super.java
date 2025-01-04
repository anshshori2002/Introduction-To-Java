class A
{
    // int a=15;
    A(int a)
    {
        // System.out.println("Upper");
        System.out.println(a);
    }
}
class B extends A
{
    B()
    {
        // super(); //-> This is added bydefault
        super(100); //For parameterised constructor we have to add the super keyword.
        System.out.println("Lower");
    }
    // int a=20;
    // void show()
    // {
    //     System.out.println(a);
    //     System.out.println(super.a);
    // }
}
class Super
{
    public static void main(String args[])
    {
        B obj = new B();
        // obj.show();
        
    }
}