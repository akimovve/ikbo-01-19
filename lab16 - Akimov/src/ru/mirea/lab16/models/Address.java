package ru.mirea.lab16.models;

public final class Address {
	private String cityName;
	private int zipCode;
	private String streetName;
	private int buildingNumber;
	private char buildingLetter;
	private int apartmentNumber;
	public Address EMPTY_ADDRESS;

	public String getCityName() {
		return cityName;
	}

	public int getZipCode() {
		return zipCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public char getBuildingLetter() {
		return buildingLetter;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}
}
