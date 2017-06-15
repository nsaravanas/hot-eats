package com.hoteats.models;

import java.util.Date;
import java.util.List;

public class Track {

	private Long trackId;

	private String bikeNo;

	private String boxId;

	private Date registrationDate;

	private List<TimeCoorinate> timeCoorinates;

	private Orders order;

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Long getTrackId() {
		return trackId;
	}

	public void setTrackId(Long trackId) {
		this.trackId = trackId;
	}

	public List<TimeCoorinate> getTimeCoorinates() {
		return timeCoorinates;
	}

	public void setTimeCoorinates(List<TimeCoorinate> timeCoorinates) {
		this.timeCoorinates = timeCoorinates;
	}

	public String getBikeNo() {
		return bikeNo;
	}

	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}

	public String getBoxId() {
		return boxId;
	}

	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

}
