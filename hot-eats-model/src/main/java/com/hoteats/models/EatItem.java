package com.hoteats.models;

import java.math.BigDecimal;

import com.hoteats.models.enums.ItemType;
import com.hoteats.models.enums.Status;

public class EatItem {

	private Long eatItemId;

	private String name;

	private Status status;

	private BigDecimal price;

	private ItemOffer offer;

	private ItemType type;

	private String description;

	public Long getEatItemId() {
		return eatItemId;
	}

	public void setEatItemId(Long eatItemId) {
		this.eatItemId = eatItemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public ItemOffer getOffer() {
		return offer;
	}

	public void setOffer(ItemOffer offer) {
		this.offer = offer;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}