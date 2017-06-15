package com.hoteats.models;

import java.math.BigDecimal;
import java.util.Date;

import com.hoteats.models.enums.OfferType;

public class ItemOffer {

	private Long itemOfferId;

	private Date offerFrom;

	private Date offerTill;

	private BigDecimal offerPercentage;

	private BigDecimal flatDiscount;

	private OfferType offerType;

	public OfferType getOfferType() {
		return offerType;
	}

	public void setOfferType(OfferType offerType) {
		this.offerType = offerType;
	}

	public Long getItemOfferId() {
		return itemOfferId;
	}

	public void setItemOfferId(Long itemOfferId) {
		this.itemOfferId = itemOfferId;
	}

	public Date getOfferFrom() {
		return offerFrom;
	}

	public void setOfferFrom(Date offerFrom) {
		this.offerFrom = offerFrom;
	}

	public Date getOfferTill() {
		return offerTill;
	}

	public void setOfferTill(Date offerTill) {
		this.offerTill = offerTill;
	}

	public BigDecimal getOfferPercentage() {
		return offerPercentage;
	}

	public void setOfferPercentage(BigDecimal offerPercentage) {
		this.offerPercentage = offerPercentage;
	}

	public BigDecimal getFlatDiscount() {
		return flatDiscount;
	}

	public void setFlatDiscount(BigDecimal flatDiscount) {
		this.flatDiscount = flatDiscount;
	}

}
