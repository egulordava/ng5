package com.example;

import java.time.LocalDate;

public class ExpenseUtils {

	private ExpenseUtils() {

	}

	public static void validateDate( LocalDate startDate, LocalDate endDate ) {

		if ( startDate == null || startDate.isAfter( endDate ) ) {
			throw new StartDateAndEndDateInvalidException();

		}
	}

}
