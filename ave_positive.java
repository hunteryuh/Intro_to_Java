// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number.
// Keep a running total and keep track of the number of entries,
// then find and return the average

// Be sure not to divide by 0. Return 0 if no scores are entered

import java.util.Scanner;

public class MathUtil
{
    public double averageScore()
    {
        //TODO Find and return the average of the numbers entered.
        Scanner in = new Scanner(System.in);
        int count=0;
        int number;
        int sum = 0;
        do{
            System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
            number = in.nextInt();
            if (number >=0){
                sum = sum + number;
                count++;
            }
        } while (number>=0);
        if (count==0){
            return 0;
        } else {
        return sum/count;
        }
    }
}
