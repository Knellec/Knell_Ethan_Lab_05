import java.util.Scanner;
public class TheaterKiosk
{
    public static void main(String[] args)
    {
       /*
       class OldEnough
	        main()
		        num DRINKING_AGE = 21
		        num age = 0

		        Output "Enter your age: "
		        Input age

		        if age >= DRINKING_AGE then
			        output "You get a wristband. please drink safely!"
		        endif
	        return
        endclass
        */

        // Declare variables
        Scanner in = new Scanner(System.in);
        int DRINKING_AGE = 21;
        int age = 0;
        String trash = "";

        // get input
        System.out.println("Enter you age: ");
        if (in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said your age was " + trash);
            System.out.println("Rerun the program and enter a valid age");
        }

        // determine if user gets a wristband
        if (age >= 21)
        {
            System.out.println("You get a wristband!");
        }
    }
}
