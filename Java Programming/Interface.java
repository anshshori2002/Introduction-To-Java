interface Vehicle
{
    String name = "TVS"; //public + static + final
    int wheel = 1; //public + static + final
    void start(); //public + abstrat
    void stop(); //public + abstract
    //Methods we can able to define in Interface class
    default void color()
    {
        System.out.println("Color: Black");
    } 
    static void speed()
    {
        System.out.println("TVS speed is 100km/hr");
    }

}
class Interface implements Vehicle
{
    public static void main(String[] args)
    {
        Interface i = new Interface();
        i.start(); i.stop();
        System.out.println("Name: "+ name);
        System.out.println("Wheel: "+ wheel);
        i.color(); //default method calling with object
        Vehicle.speed();//static method call without object

    }
    public void start()
    {
        System.out.println("Start(): Vehicale Started");
    }
    public void stop()
    {
        System.out.println("Stop(): Vehicale Stopped");
    }
}

/*
 class A
{
    void input()
    {
        System.out.println("Enter Name");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("Ansh");
    }
}
class C extends A
{
    void display()
    {
        System.out.println("Shikha");
    }
}
class Main
{
    public static void main(String[] args)
    {
        B b = new B();
        C c = new C();
        b.display();
        c.display();
    }
}
 */