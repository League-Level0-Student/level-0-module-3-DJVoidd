package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class I_am_depressed {
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("Are you happy (yes/no)");
		if (question.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		} else if (question.equals("no")) {
			String ifWantHappy = JOptionPane.showInputDialog("Do you want to be happy? (yes/no)");
			if (ifWantHappy.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Then change something");
			} else if (ifWantHappy.equals("no")) {
				JOptionPane.showMessageDialog(null, "Then Keep doing whatever you're doing");
			}
		}
	}
}
