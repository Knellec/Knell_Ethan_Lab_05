import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        /*
         class ShippingCalculation
	        main()
		        num SHIPPING_RATE = 0.02
		        num PRICE_THRESHHOLD = 100
		        num itemPrice = 0
		        num shippingCost = 0
		        num totalCost = 0

		        output "Enter the price of your item: "
		        input itemPrice

		        if itemPrice >= PRICE_THRESHHOLD then
		        	shippingCost = 0
		        else
			        shippingCost = itemPrice * SHIPPING_RATE
		        endif

		        totalCost = itemPrice + shippingCost

		        output "The shipping cost is " + shippingCost
		        output "The total cost is " + totalCost
	        return
        endclass
        */

        // Declare variables
        Scanner in = new Scanner(System.in);
        String trash = "";
        double  SHIPPING_RATE = 0.02;
        double PRICE_THRESHHOLD = 100;
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;

        // Get input
        System.out.println("Enter the price of your item: ");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said the item price was " + trash);
            System.out.println("Rerun the program and enter a valid price");
        }

        // Determine shipping cost and total cost
        if (itemPrice >= PRICE_THRESHHOLD)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = itemPrice * SHIPPING_RATE;
        }

        totalCost = itemPrice + shippingCost;

        // Display results
        System.out.println("The shipping cost is " + shippingCost);
        System.out.println("The total cost is " + totalCost);
    }
}