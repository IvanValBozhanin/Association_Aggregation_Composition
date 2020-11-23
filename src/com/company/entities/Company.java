package com.company.entities;

public class Company {
    private final String name;
    private double yearlyIncome;
    private Person ceo;

    public Company(String name, double yearlyIncome, Person ceo) {
        this.name = name;
        this.yearlyIncome = yearlyIncome;
        this.ceo = ceo;
    }

    public Company(String name, double yearlyIncome) {
        this.name = name;
        this.yearlyIncome = yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public void setCeo(Person ceo) {
        this.ceo = ceo;
    }

    public String getName() {
        return name;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public Person getCeo() {
        return ceo;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yearlyIncome=" + yearlyIncome +
                ", ceo=" + ceo.getName() +
                '}';
    }
}
