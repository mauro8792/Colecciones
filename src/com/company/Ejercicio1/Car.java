package com.company.Ejercicio1;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private String domain;
    private String holder;
    private Brand brand;


    public Car() {

    }

    public Car(String domain, String holder, Brand brand) {
        this.domain = domain;
        this.holder = holder;
        this.brand = brand;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "domain='" + domain + '\'' +
                ", holder='" + holder + '\'' +
                ", brand=" + brand +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getDomain().equals(car.getDomain());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDomain());
    }

    @Override
    public int compareTo(Car o) {
        return getDomain().compareTo(o.domain);
    }
}
