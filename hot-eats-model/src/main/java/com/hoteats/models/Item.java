package com.hoteats.models;

import java.math.BigDecimal;
import java.util.Set;

import com.hoteats.models.enums.ItemType;
import com.hoteats.models.enums.Status;

public class Item {

	private Long itemId;

	private String name;

	private Status status;

	private Set<String> tags;

	private BigDecimal price;

	private ItemOffer offer;

	private ItemType type;

	private String description;

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

	public ItemOffer getOffer() {
		return offer;
	}

	public void setOffer(ItemOffer offer) {
		this.offer = offer;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
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

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

}
