import java.util.Scanner;
class Abstraction
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.legs(); d.sound(); d.food();
        Lion l = new Lion();
        l.legs(); l.sound(); l.food();
        Cow c = new Cow();
        c.legs(); c.sound(); c.food();
    }
}
abstract class Animals
{
    void legs()
    {
        System.out.println("Animals have four legs");
    }
    abstract void sound();
    abstract void food();
}
class Dog extends Animals
{
    @Override
    void sound()
    {
        System.out.println("Dog barks");
    }
    void food()
    {
        System.out.println("Dog eat biscuits");
    }
}
class Lion extends Animals
{
    @Override
    void sound()
    {
        System.out.println("Lion roars");
    }
    void food()
    {
        System.out.println("Lion eat meat");
    }
}
class Cow extends Animals
{
    @Override
    void sound()
    {
        System.out.println("Cow moos");
    }
    void food()
    {
        System.out.println("Cow eat grass");
    }
}