package com.example;

public class Amount {

	private Long amountValue;

	private AmountType amountType;

	private SystemParameter systemparameter;

	public Amount( Long amountValue, AmountType amountType ) {
		super();
		this.amountValue = amountValue;
		this.amountType = amountType;
	}

	public void validateAmountValue() {

		if ( Long.valueOf( amountValue ) < 0 ) {
			throw new AmountValueNegativeException();
		}
		if ( Long.valueOf( amountValue ) == null ) {
			this.amountValue = systemparameter.getSystemAmountValue();
		}
	}

	public Long getAmountValue() {
		return amountValue;
	}

	public void setAmountValue( Long amountValue ) {
		this.amountValue = amountValue;
	}

	public AmountType getAmountType() {
		return amountType;
	}

	public void setAmountType( AmountType amountType ) {
		this.amountType = amountType;
	}

	public SystemParameter getSystemparameter() {
		return systemparameter;
	}

	public void setSystemparameter( SystemParameter systemparameter ) {
		this.systemparameter = systemparameter;
	}

}
