abstract class shape
{
abstract void numberside();
}
class rect extends shape
{   
void  numberside()
{
   System.out.println("number of sides of Rectangle:4");
}
}
class tria extends shape
{
void  numberside()
{
   System.out.println("number of sides of Triangle:3");
}
}
class hexa extends shape
{
   void  numberside()
{
   System.out.println("number of sides of Hexagon:6");
}
}
  class aabstract
  { 
    public static void main (String s[])
    {
      rect obj1=new rect();
      tria obj2=new tria();
      hexa obj3=new hexa();
      obj1.numberside();
      obj2.numberside();
      obj3.numberside();            
    }
   }

