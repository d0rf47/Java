package PrintCalender;

import java.util.*;


public class PrintCalender implements Print
{
    static public void main(String arg[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Full Year: ");
        int year = input.nextInt();
        System.out.print("Enter Number of Month: ");
        int month = input.nextInt();

        Print.PrintMonth(year, month);
    }
}
