package com.java.cms.model;

public class Menu {

	

	  private  int menuId ;
	  private  String itemName ;
	  private  double price ;
	  private int restaurantId ;
	  private int rating ;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Menu(int menuId, String itemName, double price, int restaurantId, int rating) {
		super();
		this.menuId = menuId;
		this.itemName = itemName;
		this.price = price;
		this.restaurantId = restaurantId;
		this.rating = rating;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", itemName=" + itemName + ", price=" + price + ", restaurantId="
				+ restaurantId + ", rating=" + rating + ", getMenuId()=" + getMenuId() + ", getItemName()="
				+ getItemName() + ", getPrice()=" + getPrice() + ", getRestaurantId()=" + getRestaurantId()
				+ ", getRating()=" + getRating() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	  
	  
	
	  
}
