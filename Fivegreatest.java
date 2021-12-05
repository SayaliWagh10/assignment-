import java.util.*;
class Fivegreatest
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      int num1,num2,num3,num4,num5;
      System.out.println("ENTER THE FIVE NUMBER");
      num1=sc.nextInt();
      num2=sc.nextInt();
      num3=sc.nextInt();
      num4=sc.nextInt();
      num5=sc.nextInt();
      
      if(num1 >= num2  && num1 >= num3 &&  num1 >= num4  && num1 >= num5 )
      {
          System.out.println(num1 + " IS GREATER THAN  " +  num2 + " "+ num3 +" " + num4 +" "+ num5);
      }
      else if(num2 >= num1  && num2 >= num3 &&  num2 >= num4  && num2 >= num5 )
      {
          System.out.println(num2 + " IS GREATER THAN  " +  num1 + " "+ num3+ " " + num4 +" "+ num5);
      }
     else if(num3 >= num1  && num3 >= num2 &&  num3 >= num4  && num3 >= num5 )
      {
          System.out.println(num3 + " IS GREATER THAN  " +  num1+ " "+ num2 + " " + num4+ " "+ num5);
      }
      else if(num4 >= num1  && num4 >= num2 &&  num4 >= num3  && num4 >= num5 )
      {
          System.out.println(num4 + " IS GREATER THAN  " +  num1+ " "+ num2 + " " + num3 +" "+ num5);
      }
      else 
      {
          System.out.println(num5 + " IS GREATER THAN  " +  num1 + " "+ num2  + " " + num3 + " "+ num4);
      }
    }
}
