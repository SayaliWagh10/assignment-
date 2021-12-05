import java.util.*;
class Evensqr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
int num=sc.nextInt();
int sqr;
if(num % 2 == 0)
{
sqr=num * num;
System.out.println("THE SQUARE OF "+num+" IS :- "+sqr);
}
}
}
