package com.company.Ejercicio1;

import java.util.*;

public class Person {
    List<String> personas = new ArrayList();

    public void addPeson(String name){
        personas.add(name);
    }
    public void getPrintPeopleList(){
        for (int i = 0; i < personas.size() ; i++) {
            System.out.println(personas.get(i));
        }
    }
    public List getPeopleList(){
        return this.personas;
    }
    public void deletePerson(String name){
         personas.remove(name);
    }
    public String getPerson(String name){
        String person= new String();
        for (int i = 0; i < personas.size() ; i++) {
            if (name.equals(personas.get(i))){
                person= personas.get(i) + " se encuentra en la Lista de Personas ";
                break;
            }else {
                person= "no se encuentra "+name;
            }
        }
        return person;
    }
    public void orderList(){
         Collections.sort(personas);
    }
}
