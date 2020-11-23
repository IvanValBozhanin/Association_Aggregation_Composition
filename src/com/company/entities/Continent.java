package com.company.entities;

public class Continent {
    private final String name;
    private long numberOfPeople;

    public Continent(String name, long numberOfPeople) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                '}';
    }
}
