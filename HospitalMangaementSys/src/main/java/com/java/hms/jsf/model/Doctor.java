package com.java.hms.jsf.model;

public class Doctor {
	
	
		private String doctorId;
		private String doctorName;
		private Specialization specialization;
		private String location;
		private String mobileNo;
		private Status isStatus;
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Specialization getSpecialization() {
		return specialization;
	}
	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Status getIsStatus() {
		return isStatus;
	}
	public void setIsStatus(Status isStatus) {
		this.isStatus = isStatus;
	}
	public Doctor(String doctorId, String doctorName, Specialization specialization, String location, String mobileNo,
			Status isStatus) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.location = location;
		this.mobileNo = mobileNo;
		this.isStatus = isStatus;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", location=" + location + ", mobileNo=" + mobileNo + ", isStatus=" + isStatus + ", getDoctorId()="
				+ getDoctorId() + ", getDoctorName()=" + getDoctorName() + ", getSpecialization()="
				+ getSpecialization() + ", getLocation()=" + getLocation() + ", getMobileNo()=" + getMobileNo()
				+ ", getIsStatus()=" + getIsStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
