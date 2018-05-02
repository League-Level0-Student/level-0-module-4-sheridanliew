import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static String pet;
	static String name;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		pet = JOptionPane.showInputDialog("What pet do you want? (dog, cat, or bird)");
		name = JOptionPane.showInputDialog("What is your pet's name?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		while (happinessLevel <= 100) {
			int input = JOptionPane.showOptionDialog(null, "What do you want to do to make your " + pet + " happy?",
					"Happiness Tasks", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food/water", "groom" }, null);
			String task = "" + input;
			// 5. Use user input to call the appropriate method created in step 4.
			if (task.equals("0")) {
				cuddle();
			} else if (task.equals("1")) {
				food();
			} else {
				groom();
			}
			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.

		}
		JOptionPane.showMessageDialog(null,
				"Good job! Your " + pet + "'s happiness level has reached over 100! Congratulations!");
	}
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	public static void cuddle() {
		happinessLevel += 35;
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "" + name + " is happy! *tail wag*");
		} else if (pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "" + name + " is happy! \"Purrrr...\"");
		} else if (pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "" + name + " is happy! \"Tweet tweet!\"");
		}
	}

	public static void food() {
		happinessLevel += 35;
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "" + name + " is full! \"Bark, bark!\"");
		} else if (pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "" + name + " is full! \"Meow.\'");
		} else if (pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "" + name + " is full! \"Chirp!\"");
		}
	}

	public static void groom() {
		happinessLevel += 35;
		if (pet.equals("dog")) {
			JOptionPane.showMessageDialog(null, "" + name + " is clean! \"Yap, yap!\"");
		} else if (pet.equals("cat")) {
			JOptionPane.showMessageDialog(null, "" + name + " is clean! *lick paws*");
		} else if (pet.equals("bird")) {
			JOptionPane.showMessageDialog(null, "" + name + " is clean! *flaps wings happily*");
		}
	}
}
