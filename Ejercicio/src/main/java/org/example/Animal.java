package org.example;

public class Animal implements IAccionesGenerales {
    String animal;
    String tipo;
    String nombre;
    public Animal(String tipo, String animal, String nombre){
        this.tipo = tipo;
        this.animal = animal;
        this.nombre = nombre;
    }

    @Override
    public String hablar() {
        return nombre + " " + "Hacer sonido";
    }

    @Override
    public String desplazarse() {
        return nombre + " " + "Desplazarse";
    }

    @Override
    public String jugar() {
        return nombre + " " + "Jugar";
    }

    @Override
    public String alimentarse() {
        return nombre + " " + "Alimentarse";
    }

    @Override
    public String dormir() {
        return nombre + " " + "Dormir";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
