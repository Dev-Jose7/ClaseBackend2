package org.example;

public class Humano implements IAccionesHumano, IAccionesGenerales{
    String nombre;
    int edad;
    String genero;

    public Humano (String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public String hablar() {
        return nombre + " " + "Hablar";
    }

    @Override
    public String desplazarse() {
        return nombre + " " + "Desplazandose";
    }

    @Override
    public String jugar() {
        return nombre + " " + "Jugando";
    }

    @Override
    public String alimentarse() {
        return nombre + " " + "Alimentarse";
    }

    @Override
    public String dormir() {
        return nombre + " " + "Dormirse";
    }

    @Override
    public String bailar() {
        return nombre + " " + "Bailar";
    }

    @Override
    public String tocarInstrumentos() {
        return nombre + " " + "Toca Instrumentos";
    }

    @Override
    public String estudiar() {
        return nombre + " " + "Estudiando";
    }

    @Override
    public String trabajar() {
        return nombre + " " + "Trabajando";
    }

    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }
}
