import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        /*
        class ValidateMonth
	        main()
		        num birthMonth = 0

		        output "Enter your birth month (1 - 12): "
		        input birthMonth

		        if birthMonth >= 1 && birthMonth <= 12 then
			        output "Your birth month is: " + birthMonth
		        else
                    output "You entered an incorrect month value: " + birthMonth
				endif
			return
        endclass

         */

        // Declare Variables
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        // Get the users birth month
        System.out.println("Enter your birth month (1 - 12): ");

        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine(); // clear buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said your birth month was " + trash);
            System.out.println("Rerun the program and enter a valid price");
        }

        // Check if month is within range
        if (birthMonth >=1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
