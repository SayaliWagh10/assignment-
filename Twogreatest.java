import java.util.*;
class Twogreatest
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      int num1,num2;
      System.out.println("ENTER THE TWO NUMBER");
      num1=sc.nextInt();
      num2=sc.nextInt();
      
      if(num1 >= num2)
      {
          System.out.println(num1 + " IS GREATER THAN  " +  num2);
      }
      
      else
      {
          System.out.println(num2  + " IS GREATER THAN " +  num1);
      }
    }
}
