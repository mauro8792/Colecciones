package com.company.Ejercicio1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Dealership {
    Set<Car> cars = new TreeSet<Car>();

    public void addCar(Car car){
        cars.add(car);
    }
    public void getPrintCars(){
        for (Car car: cars) {
            System.out.println("Dominio "+ car.getDomain() + " pertenece a " + car.getHolder());
        }
    }
    public Set getCars(){
        return this.cars;
    }
    public Car getCarByDomain(String domain){
        Car rCar = new Car();
        for (Car car : cars){
            //System.out.println("domain "+ domain);
            if(domain != null && domain.compareTo(car.getDomain())==0){
                //System.out.println("DENTRO"+car.getDomain());
                rCar=car;
            }
        }

        return rCar;
    }
    public void deleteCar(String domain){
        Car autito= new Car();
        try{
            for (Car car : cars) {
                //System.out.println("domain " +domain);
                if (car.getDomain().compareTo(domain)==0){
                    //System.out.println("borrar");
                    autito=car;
                }
            }
            if (autito.getDomain()!= null){
                cars.remove(autito);
            }else{
                System.out.println("No se encuentra el dominio  "+ domain + " que desea eliminar");
            }
        }catch (Exception e){
            System.err.println(e);
        }

    }

    public List<Car> getListCar(){
        return new ArrayList<>(cars);
    }
}
