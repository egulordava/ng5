package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;

public class ExpenseTest {

	// validate amountForEachDay method for valid amount Type and amount Value

	@Test
	public void validAmountTypeAndValue() {

		// create instance of Expense
		Amount amount = new Amount( 10L, AmountType.DAILY_AMOUNT );
		Expense expense = new Expense( LocalDate.now(), null, amount );

		// call method
		expense.expenseForEachDay( LocalDate.now(), null );

		// asserts
		assertThat( amount.getAmountType() ).isEqualTo( AmountType.DAILY_AMOUNT );
		assertThat( amount.getAmountValue() ).isEqualTo( 10L );

	}

	// validate amountForEachDay method for invalid amount Type
	@Test
	public void invalidAmountType() {

	}

	// validate amountForEachDay method for invalid amount Value

}
