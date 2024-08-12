package Inheritance;

class Rectangle
{
    int length;
    int breadth;

    public Rectangle()
    { 
        length=breadth=1;
    }
    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}

class Cuboid extends Rectangle
{
    int height;

    public Cuboid()
    {
        height = 1;
    }
    public Cuboid(int h)
    {
        height = h;
    }
    public Cuboid(int l,int b,int h)
    {
        super(l,b);
        height = h;
    }
    int Volume()
    {
        return length*breadth*height;
    }
}
public class RectangleParam {
    public static void main(String[] args) {
        //Cuboid c = new Cuboid();
        //Cuboid c = new Cuboid(10);
        Cuboid c = new Cuboid(5,3,10);
        System.out.println(c.Volume());
    }
}
