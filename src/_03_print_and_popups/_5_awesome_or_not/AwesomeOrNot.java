package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
         public static void main( String [] args) {
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	       int randomnumber = ran.nextInt (5);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	       System.out.println(randomNumber);
		// 3. Print your variable to the console
	       
		// 4. Get the user to enter something that they think is awesome
	       String awesome = JOptionPane.showInputDialog("Cats");
		// 5. If your variable is  0
	       if (randomNumber == 0) {
			// -- tell the user whatever they entered is awesome!
	         JOptionPane.showMessageDialog(null, awesome + "is Awesome");
		// 6. If your variable is  1
	         else if (randomNumer == 1) {
			// -- tell the user whatever they entered is ok.
	         JOption.showMessageDialog ( null, awesome + "is ok");
		// 7. If your variable is  2
	         else if (randomNumber== 2) {
			// -- tell the user whatever they entered is boring.
	        JOptionPane.showMessageDialog(null,  awesome +" is boring");
		// 8. If your variable is  3
	 
			// -- invent your own message to give to the user (be nice).

}
