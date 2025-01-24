package com.campusdual.classroom;

public class Teacher extends Person {

    protected String area;

    public Teacher(String name, String surname, String area) {
        super(name, surname);
        this.area = area;
    }

    @Override
    public void getDetails() {
        System.out.println("Profesor " + super.name + " " + super.surname + ", perteneciente al área de " + this.area.toLowerCase());
    }
}
