package seleniumPractise;

import javax.swing.JOptionPane;

public class Joption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JOptionPane.showMessageDialog(null, "This is a message!", "Message", JOptionPane.INFORMATION_MESSAGE);	
		
		  String name = JOptionPane.showInputDialog(null, "Enter your name:", "Input Dialog", JOptionPane.QUESTION_MESSAGE);
	        System.out.println("Your name is: " + name);
	        
	        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);  
	        
	        if (response == JOptionPane.YES_OPTION) {
	            System.out.println("You clicked Yes");
	        } else if (response == JOptionPane.NO_OPTION) {
	            System.out.println("You clicked No");
	        } else if (response == JOptionPane.CANCEL_OPTION) {
	            System.out.println("You clicked Cancel");
	        }
		
	}

}
