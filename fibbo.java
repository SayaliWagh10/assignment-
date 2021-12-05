
import java.util.*;
public class fibbo
{
public void fib()
{
int n1=0,n2=1,n3,i,count;
Scanner sc=new Scanner(System.in) ;
count=sc.nextInt(); 
System.out.println(n1+" "+n2);
for(i=2;i<count;++i)
{
n3=n1+n2;   
System.out.print(" The Fibo series "+n3);    
n1=n2;    
n2=n3;    
} 
}
}
