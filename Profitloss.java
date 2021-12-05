import java.util.*;
class Profitloss
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int cost,selling,pl;
System.out.println("ENTER THE SELLING PRICE");
cost=sc.nextInt();
System.out.println("ENTER THE COST PRICE");
selling=sc.nextInt();

pl=selling-cost;

if(pl < 0)
{
System.out.println("IT IS A PROFIT");
}
else if(pl > 0)
{
System.out.println("IT IS A LOSS");
}
else
{
System.out.println("IT IS A NOT PROFIT NOR LOSS");
}
}
}