class A //Super Class
{
    int a,b,c;
    void add()
    {
        a = 10; b = 20;
        c = a + b;;
        System.out.println("Sum = " + c);
    }
    void sub()
    {
        a = 10; b = 20;
        c = a - b;
        System.out.println("Sub = " + c);
    }
}
class B extends A  //Sub1
{
    void mul()
    {
        a = 10; b = 20;
        c = a * b;
        System.out.println("Mul = " + c);
    }
    void div()
    {
        a = 10; b = 20;
        c = a / b;
        System.out.println("Div = " + c);
    }
}
class C extends B  //Sub2
{
    void rem()
    {
        a = 10; b = 20;
        c = a % b;
        System.out.println("Mod = " + c);
    }
}
class Inheritance
{
    public static void main(String[] args)
    {
        C obj = new C();
        obj.add(); obj.sub(); obj.mul(); obj.div(); obj.rem();
    }
}