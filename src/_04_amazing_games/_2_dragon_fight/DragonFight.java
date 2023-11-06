package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		  int playerHealth=100;
		   int dragonHealth=100;
			// playerHealth to store your health - set it equal to 100
	       
			// dragonHealth to store the dragon's health - set it equal to 100

		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		   int playerAttack=0;
		   int dragonAttack=0;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.

		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON
                String playerAction=JOptionPane.showInputDialog("Yell or Kick");
				
	              if (playerAction.equalsIgnoreCase("yell")) {
	            	  playerAttack=ran.nextInt(10);
	            	  
	              }
	              else if (playerAction.equalsIgnoreCase("kick")) {
		           playerAttack=ran.nextInt(25);
		           dragonHealth -= playerAttack;
	              }
		        dragonHealth-=playerAttack;
		        
		        dragonAttack=ran.nextInt(35);
		        playerHealth -= dragonAttack;
		         
		        if (playerHealth <= 0) {
		        	playerLost();
		        }
		        else if(dragonHealth <= 0); {
		        dragonLost();
		        }
		        JOptionPane.showMessageDialog(null, "PlayerHealth: " + playerHealth + 
		        		  "\nLost " + dragonAttack + "health!");
		        JOptionPane.showMessageDialog(null,  "Dragon Health:" + dragonHealth +
		        		   "\nLost: " + playerAttack + "health!");
		         // ASSESS THE DAMAGE

				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
	
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method

			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.

			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
      JOptionPane.showMessageDialog(null,  "You have beend deafeated by the dragon and have no treasure!");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
    JOptionPane.showMessageDialog(null, "You deafedted the dragon and got a ton of gold!");
		System.exit(0);   //This code ends the program
	}

}
