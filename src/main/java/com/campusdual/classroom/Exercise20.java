package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> listaPersona = new ArrayList<>();
        listaPersona.add(new Person("John", "Smith"));
        listaPersona.add(new Teacher("María", "Montessori", "Educación"));
        listaPersona.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        listaPersona.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

        return listaPersona;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person p: stringList) {
            p.getDetails();
        }
    }

    public static void main(String[] args) {
        showPeopleDetails(getPeopleList());
    }
}
