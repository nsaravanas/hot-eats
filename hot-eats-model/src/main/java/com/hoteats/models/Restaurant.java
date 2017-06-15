package com.hoteats.models;

import java.util.List;

public class Restaurant {

	private Long restaurantId;

	private String name;

	private List<RestaurantAddress> branches;

	private List<Menu> menu;

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RestaurantAddress> getBranches() {
		return branches;
	}

	public void setBranches(List<RestaurantAddress> branches) {
		this.branches = branches;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

}
