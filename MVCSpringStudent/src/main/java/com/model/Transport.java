package com.model;

public class Transport {

	private float fare;
	private String transportType;
	public Transport(float fare, String transportType) {
		super();
		this.fare = fare;
		this.transportType = transportType;
	}
	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	public String getTransportType() {
		return transportType;
	}
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	
	
}
