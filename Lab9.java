import java.util.*;
 class Lab9
 {
  
  void area(float a,float b)
  {
    float c=a*b;
    System.out.println("area of rectangle:"+c);
  }

  void area(float a)
  {
   float d=a*a;
   System.out.println("area of square:"+d);
  }

  void area(double x ,double y)
  {
   double e=0.5*x*y;
   System.out.println("area of triangle:"+e);
  }

  public static void main(String args[])
  {
   Lab9 ob=new Lab9();
   ob.area(1,2);
   ob.area(3);
   ob.area(2.0,4.0);
  }
}
output:
area of rectangle:2.0
area of square:9.0
area of triangle:4.0
