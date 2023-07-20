package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class I_am_depressed {
public static void main(String[] args) {
	String question = JOptionPane.showInputDialog("Are you happy");
	if (question.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Kepp doing whatever you're doing");
		
	}
}
}
