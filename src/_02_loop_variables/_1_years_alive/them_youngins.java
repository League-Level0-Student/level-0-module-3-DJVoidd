package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class them_youngins {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "This code tells you all of the years you were alive");
	String yearString = JOptionPane.showInputDialog("what year were you born?");
	int yearStart = Integer.parseInt(yearString);
	int years = yearStart;
	while (years <= 2023){
		System.out.println(years);
		years += 1;
	}
}
}
