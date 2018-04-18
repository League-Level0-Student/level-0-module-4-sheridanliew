import javax.swing.JOptionPane;

public class TestScores {
	//Write code to ask the user what their test score is and give different messages accordingly.
    //Example: "Wow! You must have studied really hard for that test!"

public static void main(String[] args) {
String input=JOptionPane.showInputDialog("What is your test score? (0-100%)");
double score=Double.parseDouble(input);
if (score>90) {
	JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
}
if (score<70) {
	JOptionPane.showMessageDialog(null, "Nice try... Study harder next time!");
}
if (score<90&&score>70) {
	JOptionPane.showMessageDialog(null, "Good job! ... but you can do better!");
}
}
}
