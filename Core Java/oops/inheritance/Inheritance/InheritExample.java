package Inheritance;

class Parent
{
    public Parent()
    {
        System.out.println("parent constructor");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("child constructor");
    }
}
class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grandchild constructor");
    }
}
public class InheritExample {
    public static void main(String[] args) {
        //Parent p = new Parent();
        //Child c = new Child();
        GrandChild gc = new GrandChild();
    }
}
