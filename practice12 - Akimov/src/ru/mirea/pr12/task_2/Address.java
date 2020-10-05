package ru.mirea.pr12.task_2;

import java.util.StringTokenizer;

public class Address {
    final private String country;
    final private String region;
    final private String city;
    final private String street;
    final private String house;
    final private String building;
    final private String apartment;
    final static int ELEMENT_NUM = 7;

    public Address(String address, String separate) {
        StringTokenizer response = new StringTokenizer(address, separate);
        if (response.countTokens() != ELEMENT_NUM)
            throw new IllegalStateException("Неправильно введены исходные данные");
        this.country = response.nextToken().trim();
        this.region = response.nextToken().trim();
        this.city = response.nextToken().trim();
        this.street = response.nextToken().trim();
        this.house = response.nextToken().trim();
        this.building = response.nextToken().trim();
        this.apartment = response.nextToken().trim();
    }

    public Address(String address) {
        String[] response = address.split(",");
        if (response.length != ELEMENT_NUM)
            throw new IllegalStateException("Неправильно введены исходные данные");
        this.country = response[0].trim();
        this.region = response[1].trim();
        this.city = response[2].trim();
        this.street = response[3].trim();
        this.house = response[4].trim();
        this.building = response[5].trim();
        this.apartment = response[6].trim();
    }

    @Override
    public String toString() {
        return "Address {" +
                "country = '" + country + '\'' +
                ", region = '" + region + '\'' +
                ", city = '" + city + '\'' +
                ", street = '" + street + '\'' +
                ", house = '" + house + '\'' +
                ", building = '" + building + '\'' +
                ", apartment = '" + apartment + '\'' +
                '}';
    }
}
