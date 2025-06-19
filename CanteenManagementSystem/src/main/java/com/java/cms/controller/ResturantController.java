package com.java.cms.controller;

import com.java.cms.dao.ResturantDao;
import com.java.cms.model.Restaurant;



public class ResturantController {
	private ResturantDao ResturantDao;
	private Restaurant Restaurant;

	public ResturantDao getResturantDao() {
		return ResturantDao;
	}
	public void setResturantDao(ResturantDao resturantDao) {
		ResturantDao = resturantDao;
	}
	public Restaurant getRestaurant() {
		return Restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		Restaurant = restaurant;
	}

}
