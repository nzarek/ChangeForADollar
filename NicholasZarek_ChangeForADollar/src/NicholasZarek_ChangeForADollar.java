import java.util.Scanner;

/*******************************************************************/
/*Program:  Change For A Dollar                                    */
/*CIS163AA                                                         */
/*Nicholas Zarek                                                   */
/*10/01/2017                                                       */
/*This program provides the correct change for a value less than 99*/
/*******************************************************************/
public class NicholasZarek_ChangeForADollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
	
		int pocketChange = 0;
		
		int pennies = 0;
		int nickels = 0;
		int dimes = 0;
		int quarters = 0;
		int halfDollars = 0;
		
		System.out.print("Please enter your pocket change that is less than $1: ");
		pocketChange =  scnr.nextInt(); //user input
		
		while ((pocketChange > 99 || pocketChange < 1)) {
			System.out.print("Only a value between 1 and 99 may be entered. The program will now close.");
			System.exit(0); //validating input is within the defined parameters and termninating program is requirements are not met
		}
		//allocating user input to the varied coin types working top-down to output change in an "efficient" manner 
		if (pocketChange >= 50) {
			pocketChange -= 50;
			++halfDollars;
		}
		 while (pocketChange >= 25) {
			pocketChange -= 25;
			++quarters;
		}
		while (pocketChange >= 10) {
			pocketChange -= 10;
			++dimes;
		}	
		 while (pocketChange >= 5) {
			pocketChange -= 5;
			++nickels;
		}
		 while (pocketChange >= 1) {
			pocketChange -= 1;
			++pennies;
		}		
	//results 
		System.out.println("Your pocket change is " + halfDollars + " Half dollars, " + quarters + " quarters, "
				+ dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
		scnr.close();
	}
	
}
