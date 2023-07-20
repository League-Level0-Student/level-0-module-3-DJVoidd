
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		System.out.println("the correct answer is " + random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i=1; i<10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String guess = JOptionPane.showInputDialog("pick a number 1-100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int numGuess = Integer.parseInt(guess);
			// 5. if the guess is correct
				if (numGuess == random){
					JOptionPane.showMessageDialog(null, "You guessed it! The number was " + random + "!");
					System.exit(0);
				}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				if (numGuess >= random) {
					JOptionPane.showMessageDialog(null, "That number is too high!");
				}
						
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
				if (numGuess <= random) {
					JOptionPane.showMessageDialog(null, "That number is too low!");
				}
		}
		JOptionPane.showMessageDialog(null, "You took too long to guess the number");
		
		// 13. Tell them they lose
		
	}

}


