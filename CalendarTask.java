package com.tcs.training.example;

import java.text.DateFormatSymbols;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

class CalendarTask {
	public static void main(String args[]) throws Exception {
		printCalendar(2016, 2);
	}

	static void printCalendar(int year, int ncols) {
		if (ncols < 1 || ncols > 12)
			throw new IllegalArgumentException("Illegal column width. ");

		Calendar date = new GregorianCalendar(year, 0, 1);

		int nRows = (int) Math.ceil(12.0 / ncols);
		int offs = date.get(Calendar.DAY_OF_WEEK) - 1;
		int w = ncols * 24;

		String[] monthNames = new DateFormatSymbols(Locale.US).getMonths();

		String[][] mons = new String[12][8];
		for (int m = 0; m < 12; m++) {
			String name = monthNames[m];
			int len = 11 + name.length() / 2;
			String format = MessageFormat.format("%{0}s%{1}s", len, 21 - len);

			mons[m][0] = String.format(format, name, " ");
			mons[m][1] = "Su Mo Tu We Th Fr Sa ";
			int dim = date.getActualMaximum(Calendar.DAY_OF_MONTH);

			for (int d = 1; d < 43; d++) {
				boolean isDay = d > offs && d <= offs + dim;
				String entry = isDay ? String.format(" %2s", d - offs) : " ";
				if (d % 7 == 1)
					mons[m][2 + (d - 1) / 7] = entry;
				else
					mons[m][2 + (d - 1) / 7] += entry;
			}
			offs = (offs + dim) % 7;
			date.add(Calendar.MONTH, 1);
		}
		System.out.printf(" % " + (w / 2 + 10) + "s%n", "[Snoopy Picture]");
		System.out.printf(" % " + (w / 2 + 4) + "s%n%n", year);

		for (int r = 0; r < nRows; r++) {
			for (int i = 0; i < 8; i++) {
				for (int c = r * ncols; c < (r + 1) * ncols && c < 12; c++) {
					System.out.printf("   %s", mons[c][i]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
