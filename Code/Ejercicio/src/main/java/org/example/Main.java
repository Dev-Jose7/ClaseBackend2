package org.example;

public class Main {
    public static void main(String[] args) {
        Hombre hombre = new Hombre("José", 24);
        Mujer mujer = new Mujer("Valeria", 21);

        System.out.println(hombre);
        System.out.println(mujer);

        System.out.println(hombre.alimentarse());
        System.out.println(mujer.bailar());
        System.out.println(hombre.trabajar());
        System.out.println(mujer.estudiar());

        System.out.println("===========================");
        System.out.println("===========================");

        Perro perro = new Perro("Max");
        Gato gato = new Gato("Manchas");

        System.out.println(perro);
        System.out.println(gato);

        System.out.println(perro.hablar());
        System.out.println(gato.jugar());
        System.out.println(perro.alimentarse());
        System.out.println(gato.dormir());
    }
}