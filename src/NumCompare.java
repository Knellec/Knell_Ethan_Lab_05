import java.util.Scanner;
public class NumCompare
{
    public static void main(String[] args)
    {
        /*
        class NumberComparison
	        main()
		        num num1 = 0
		        num num2 = 0

		        output "Enter your first number: "
		        input num1
		        output "Enter your second number: "
		        input num2

		        if num1 < num2 then
		        	output num1 + " is the lower number."
		        elseif num1 > num2 then
			        output num2 + " is the lower number."
		        else
			        output "These numbers are equal."
		        endif
	        return
        endclass
         */

        //Declare variables
        Scanner in = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        String trash = "";

        // Get input
        // get first number
        System.out.println("Enter your first number: ");

        if (in.hasNextDouble()) //first number is valid?
        {
            num1 = in.nextInt();
            in.nextLine();

            // get second number
            System.out.println("Enter your second number: ");
            if (in.hasNextDouble()) // second number is valid?
            {
                num2 = in.nextInt();
                in.nextLine();
                // both numbers are valid. compare numbers
                if (num1 < num2)
                {
                    System.out.println(num1 + " is the lower number.");
                }
                else if (num1 > num2)
                {
                    System.out.println(num2 + " is the lower number.");
                }
                else
                {
                    System.out.println("These numbers are equal.");
                }
            }
            else // second number not valid.
            {
                trash = in.nextLine();
                System.out.println("\nYou said your number was " + trash);
                System.out.println("Rerun the program and enter a valid number");
            }
        }
        else // first number is not valid.
        {
            trash = in.nextLine();
            System.out.println("\nYou said your number was " + trash);
            System.out.println("Rerun the program and enter a valid number");
        }
    }
}
