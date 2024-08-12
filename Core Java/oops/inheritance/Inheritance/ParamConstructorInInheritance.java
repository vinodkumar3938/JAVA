class Parent
{
    public Parent()
    {
        System.out.println("Non-param constructor of parent");
    }
    public Parent(int x)
    {
        System.out.println("param constructor of parent " + x);
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Non-param constructor of child");
    }
    public Child(int y)
    {
        System.out.println("param constructor of child");
    }
    public Child(int x,int y)
    {
        super(x);
        System.out.println("2 param of Child " + y);
    }
}

public class ParamConstructorInInheritance {
    public static void main(String[] args) {
        //Parent p = new Parent();
        //Child c = new Child();
        //Child c = new Child(10);
        Child c = new Child(2,4);
    }
}
