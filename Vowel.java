import java.util.*;

class Vowel 
{
    public static void main(String[] args)
    {
        int month;
        int day;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month:");
        month = sc.nextInt(); 
        System.out.print("Enter day:");
	day=sc.nextInt();
	System.out.print("Enter a alphabet:");
        ch = sc.next().charAt(0);
        switch (month)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter valid month.");
        }
	switch(day)
         {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
	    case 3:
                System.out.println("Tuesday");
                break;
	    case 4:
                System.out.println("Wednsday");
                break;
	    case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
	   case 7:
                System.out.println("Saturday");
                break;
           default:
                System.out.println("Enter valid day.");
        }

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
{
            System.out.println(" the alphabet is vowel" + ch);
}
        else
{
            System.out.println("The alphabet is not vowel" + ch);

}
    }
}