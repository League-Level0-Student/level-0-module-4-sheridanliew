//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String answer=JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickel=Integer.parseInt(answer);
		// Ask the user how many dimes they have, and convert their answer
String input=JOptionPane.showInputDialog("How many dimes do you have?");
int dime=Integer.parseInt(input);
		// Ask the user how many quarters they have, and convert their answer
String reply=JOptionPane.showInputDialog("How many quarters do you have?");
int quarter=Integer.parseInt(reply);
		// Calculate how much money the user has and save it in a double variable 
double money=nickel*0.05+dime*0.1+quarter*0.25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have "+money+" dollars!");
	}
}

