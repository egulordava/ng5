package com.example;

import java.time.LocalDate;

public class Expense {

	private LocalDate startDate;

	private LocalDate endDate;

	private Amount amount;

	public Expense( LocalDate startDate, LocalDate endDate, Amount amount ) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
	}

	// retrieve an amount value for given period
	public Long expenseForEachDay( LocalDate startDate, LocalDate endDate ) {

		ExpenseUtils.validateDate( startDate, endDate );

		this.amount.validateAmountValue();

		if ( this.amount.getAmountType().equals( AmountType.DAILY_AMOUNT ) ) {

			return amount.getAmountValue();
		}

		// should be checked for weekly and monthly amount type and should be returned sum of amount according
		// number of days

		else {

			throw new InvalidDailyAmountException();
		}
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate( LocalDate startDate ) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate( LocalDate endDate ) {
		this.endDate = endDate;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount( Amount amount ) {
		this.amount = amount;
	}

}
