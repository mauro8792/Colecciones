package com.company;

import com.company.Ejercicio1.Brand;
import com.company.Ejercicio1.Car;
import com.company.Ejercicio1.Dealership;
import com.company.Ejercicio1.Person;

import java.util.*;

public class Main {

    public static Map <Brand, List<Car>> groupByBrand(List<Car> listCars){
        Map<Brand,List<Car>> resultList = new HashMap<>();
        List<Brand> brands = Arrays.asList(Brand.values());
        for ( Brand brand: brands) {
            resultList.put(brand, new ArrayList<Car>());
        }
        for ( Car car: listCars) {
            resultList.get(car.getBrand()).add(car);
        }
        return resultList;
    }


    public static void main(String[] args) {
        String entradaTeclado = "";

        Person personas = new Person();
        personas.addPeson("Mauro");
        personas.addPeson("Cesar");
        personas.addPeson("Patricia");
        personas.addPeson("Pamela");
        personas.addPeson("Federico");
        personas.addPeson("Ricardo");
        personas.addPeson("Gustavo");

//        personas.getPrintPeopleList();
//
//        personas.orderList();
//        System.out.println("\nArray list ordenado \n");
//        personas.getPrintPeopleList();
//
//        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
//        System.out.println("\nQue nombbre desea eliminar?");
//        entradaTeclado = entradaEscaner.nextLine ();
//        personas.deletePerson(entradaTeclado);
//        System.out.println(entradaTeclado +" ha sido eliminado! Hasta la vista Baby\n");
//        personas.getPrintPeopleList();
//
//        Scanner entradaEscaner1 = new Scanner(System.in); //Creación de un objeto Scanner
//        System.out.println("\nQue nombbre desea Buscar?");
//        entradaTeclado = entradaEscaner1.nextLine ();
//        System.out.println(personas.getPerson(entradaTeclado));

        Dealership collectionCars = new Dealership();
        Car auto1 = new Car("AA913UJ","Mauro", Brand.FIAT);
        Car auto5 = new Car("AA913UJj","Mauro",Brand.BMW);
        Car auto2 = new Car("EKF512","Pamela", Brand.FORD);
        Car auto3 = new Car("LUH510","Silvia", Brand.TOYOTA);
        Car auto4 = new Car("AA122RR","Ricardo", Brand.FIAT);
        //System.out.println(auto1.getDomain());
        collectionCars.addCar(auto1);
        collectionCars.addCar(auto2);
        collectionCars.addCar(auto3);
        collectionCars.addCar(auto4);
        collectionCars.addCar(auto5);
//        System.out.println("\nColleciones de autos TreeSet");
//        collectionCars.getPrintCars();
//
//        Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
//        System.out.println("\nQue Dominio desea buscar?");
//        entradaTeclado = entradaEscaner.nextLine ();
//        System.out.println("El AUTO buscado es: " + collectionCars.getCarByDomain(entradaTeclado).getDomain());
//
//        //Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
//        System.out.println("\nQue Dominio desea ELIMINAR?");
//        entradaTeclado = entradaEscaner.nextLine ();
//        collectionCars.deleteCar(entradaTeclado);
//        System.out.println("lista nueva impresa");
//
//        collectionCars.getPrintCars();
        System.out.println(groupByBrand(collectionCars.getListCar()));



    }

}
