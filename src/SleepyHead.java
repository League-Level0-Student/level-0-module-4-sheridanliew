
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday = true, isVacation = false;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */
		int vacation = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "", JOptionPane.YES_NO_OPTION);
		if (vacation == 0) {
			isVacation = true;
			JOptionPane.showMessageDialog(null, "Sleep in...");
		} else if (vacation == 1) {
			isVacation = false;
			int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
			if (weekday == 0) {
				isWeekday = true;
			} else if (weekday == 1) {
				isWeekday = false;
			}

			if (!isWeekday) {
				JOptionPane.showMessageDialog(null, "Sleep in...");
			} else {
				JOptionPane.showMessageDialog(null, "Get up, lazybones!!!");
			}
		}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
