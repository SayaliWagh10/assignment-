import java.util.*;
class Circle
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
float radius;
double area,circumference;
System.out.println("ENTER THE RADIUS OF CIRCLE");
radius=sc.nextFloat();

area=3.14*radius*radius;
circumference=2*3.14*radius;
System.out.println("AREA OF CIRCLE IS " + area);
System.out.println("CIRCUMFERENCE OF CIRCLE IS " + circumference);
}
}
