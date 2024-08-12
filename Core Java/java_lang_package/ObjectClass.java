package java_lang_package;

import java.lang.*;


class MyObject
{
    public String toString()
    {
        return "My Object";
    }
    
    public int hashCode()
    {
        return 100;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
//    public void notify()
//    {
//        cant overide this method.
//    }
}

public class ObjectClass 
{
    public static void main(String[] args) 
    {
        MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        
        System.out.println(o1.equals(o2));
        System.out.println(o1);// automatically calls toString()
        System.out.println(o1.hashCode());
        
    }    
}