package com.company.entities;

public class Town {
    private final String name;
    private final Country country;
    private long numberOfPeople;

    public Town(String name, Country country, long numberOfPeople) {
        this.name = name;
        this.country = country;
        this.numberOfPeople = numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", country=" + country.getName() +
                ", numberOfPeople=" + numberOfPeople +
                '}';
    }
}
