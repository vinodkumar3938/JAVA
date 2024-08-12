package oops.inheritance;

class Rec1
{
    int length;
    int breadth;

    public Rec1()
    { 
        length=breadth=1;
    }
    
    public Rec1(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}

class Cuboid extends Rec1
{
    int height;

    public Cuboid() {
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
public class Rectangle {
    public static void main(String[] args) {
        //Cuboid c = new Cuboid();
        //Cuboid c = new Cuboid(10);
        Cuboid c = new Cuboid(5,3,10);
        System.out.println(c.Volume());
    }
}

