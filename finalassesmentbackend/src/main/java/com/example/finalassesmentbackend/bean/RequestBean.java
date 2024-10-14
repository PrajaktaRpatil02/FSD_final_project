package com.example.finalassesmentbackend.bean;

public class RequestBean {
	
	private String city;
	private Integer min;
	private Integer max;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public RequestBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RequestBean [city=" + city + ", min=" + min + ", max=" + max + "]";
	}
	
	

}
