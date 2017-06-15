package com.hoteats.models;

import com.hoteats.models.enums.ModeOfPay;

public class OrderPrice {

	private Double totalAmount;

	private Double amountPaid;

	private ModeOfPay modeOfPay;

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public ModeOfPay getModeOfPay() {
		return modeOfPay;
	}

	public void setModeOfPay(ModeOfPay modeOfPay) {
		this.modeOfPay = modeOfPay;
	}

}
