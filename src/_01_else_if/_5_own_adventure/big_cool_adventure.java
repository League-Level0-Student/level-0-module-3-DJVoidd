package _01_else_if._5_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class big_cool_adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to your big cool adventure!");
		String q1 = JOptionPane.showInputDialog("What do you do first?\n\nDo you wake up\nor stay asleep?\n\n(wake/slep)");
		if(q1.equals("slep")) {
		String qq3 = JOptionPane.showInputDialog("You had a wacky dream that woke you up.\nOnce you wake you find that your boss has fired you for sleeping in.\n\nWhat do you do?\nAccept your fate\nBuy a lottery ticket\n\n(Accept/Lotto)");
		if(qq3.equals("accept")) {
			JOptionPane.showMessageDialog(null,"You live the rest of your life in poverty, Ouch.\n\nRun again to restart");
		}
		Random ran = new Random();			
		int winner = ran.nextInt( 2000000000 - 25 + 1 ) + 10;
		String win = JOptionPane.showInputDialog("What is you number?");
		int winInt = Integer.parseInt(win);
		if(winInt ==winner) {
			JOptionPane.showMessageDialog(null,"You won the lottery!\n you live the rest of your life rich\n\nrestart to play again");
		}
		else {
			JOptionPane.showMessageDialog(null,"You lost the lottery and live the rest of your life in poverty, Ouch.\\n\\nRun again to restart");
		}
		}
		if (q1.equals("wake")) {
			String wq2 = JOptionPane.showInputDialog(
					"You got out of bed and feel terrible.\n\n What do you do?\n\nGet ready for work\nQuit your job\n\n(Go/Quit)");

			if (wq2.equals("go")) {
				JOptionPane.showMessageDialog(null,
						"You go and work at your job all day then come home and go to bed\n\nrestart program to go again");
			}
			if(wq2.equals("quit")) {
				String qq3 = JOptionPane.showInputDialog("You quit your job and now are about to lose your house\n\nWhat do you do?\nAccept your fate\nBuy a lotte0y ticket\n\n(Accept/Lotto)");
			if(qq3.equals("accept")) {
				JOptionPane.showMessageDialog(null,"You live the rest of your life in poverty, Ouch.\n\nRun again to restart");
			}
			Random ran = new Random();			
			int winner = ran.nextInt(2000000000);
			String win = JOptionPane.showInputDialog("What is you number?");
			int winInt = Integer.parseInt(win);
			if(winInt ==winner) {
				JOptionPane.showMessageDialog(null,"You won the lottery!\n you live the rest of your life rich\n\nrestart to play again");
			}
			else {
				JOptionPane.showMessageDialog(null,"You lost the lottery and live the rest of your life in poverty, Ouch.\\n\\nRun again to restart");
			}
			}
			
			}
		}
	}
