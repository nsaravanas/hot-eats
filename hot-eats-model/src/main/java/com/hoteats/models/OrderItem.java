package com.hoteats.models;

import java.math.BigDecimal;

public class OrderItem {

	private Long orderItemId;

	private Item item;

	private EatItem eatItem;

	private Integer quantity;

	private BigDecimal price;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public EatItem getEatItem() {
		return eatItem;
	}

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setEatItem(EatItem eatItem) {
		this.eatItem = eatItem;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

}
