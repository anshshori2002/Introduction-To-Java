class Person
{
    int age=22;
    int weight=57;
    String color="Light";

    void eat()
    {
        System.out.println("I am Eating");
    }

    void sleep()
    {
        System.out.println("I am Sleeping");
    }
    public static void main(String args[])
    {
        Person p = new Person();
        System.out.println("Age: "+p.age);
        System.out.println("Weight: "+p.weight);
        System.out.println("Color: "+p.color);
        p.eat();
        p.sleep();
    }
}