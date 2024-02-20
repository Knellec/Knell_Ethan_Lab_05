import java.util.Scanner;
public class PartyAffiliation
{
    public static void main(String[] args)
    {
        /*
        class PartyAffiliation
	        main()
		        string politicalParty = ""

		        output "Enter your party affiliation (Democrat, Republican, or Independent): "
		        input politicalParty

		        if politicalParty == "Democrat" !! "democrat" then
			        output "You get a Democratic Donkey."
		        elseif politicalParty == "Republican" !! "republican" then
			        output "You get a Republican Elephant."
		        elseif politicalParty == "Independent" !! "independent" then
			        output "You get an independent man"
		        else
			        output "You did not enter a valid entry."
		        endif
	        return
        endclass
         */

        // Declare variables
        Scanner in = new Scanner(System.in);
        String politicalParty = "";

        // Get users political affiliation
        System.out.println("Enter your party affiliation:\nDemocrat(D)\nRepublican(R)\nIndependent(I)\nOther");
        politicalParty = in.next();
        System.out.println(politicalParty);
        // Output party animal
        if (politicalParty.equals("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (politicalParty.equals("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (politicalParty.equals("I"))
        {
            System.out.println("You get an independent person");
        }
        else
        {
            System.out.println("You are of another political affiliation");
        }
    }
}
