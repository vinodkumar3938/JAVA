package Inheritance;


class Rectangle
{
    int length;
    int breadth;

    public Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    void display()
    {
        System.out.println("length : " + this.length);
        System.out.println("breadth : " + this.breadth);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        r1.display();

        Rectangle r2 = new Rectangle(2,4);
        r2.display();
    }
}
