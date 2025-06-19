package com.java.cms.model;

public class Restaurant {

	
	
	private int restaurantId ;
	  private String restaurantName ;
	  private String city ;
	  private double rating ;
	 

  public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", city=" + city
				+ ", rating=" + rating + "]";
	}
	public Restaurant(int restaurantId, String restaurantName, String city, double rating) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.city = city;
		this.rating = rating;
	}
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

 

  
}