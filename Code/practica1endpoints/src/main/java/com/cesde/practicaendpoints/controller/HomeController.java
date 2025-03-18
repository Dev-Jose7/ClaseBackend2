package com.cesde.practicaendpoints.controller;

import com.cesde.practicaendpoints.model.Empleado;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public String inicio(){
        return "El servidor esta iniciado";
    }

    @GetMapping("/estudiante")
    public Object estudiante(){
        return new Object() { // Spring Boot devuelve en formato JSON automático
            public int id = 1;
            public String nombre = "José Navarro";
            public int edad = 24;
            public String carrera = "Ingeniería de Software";
            public String email = "jose.navarro@example.com";
        };
    }

    // Con RequestParam /notas?nota1=4.5&nota2=4.3&nota3=4.0 (Se usa query string/cadena de consulta)
    @GetMapping("/notas")
    public double notasrp(@RequestParam double nota1, @RequestParam double nota2, @RequestParam double nota3){
        double promedio = nota1*0.3 + nota2*0.35 + nota3*0.35;
        return promedio;
    }

    // Con PathVariable /notas/5/4.5/4
    @GetMapping("/notas/{nota1}/{nota2}/{nota3}")
    public double notaspv(@PathVariable double nota1, @PathVariable double nota2, @PathVariable double nota3){
        double promedio = nota1*0.3 + nota2*0.35 + nota3*0.35;
        return promedio;
    }

    @GetMapping("/notasprom")
    public String notasProm(@RequestParam double nota1, @RequestParam double nota2, @RequestParam double nota3){
        String estado = "";
        double promedio = nota1*0.3 + nota2*0.35 + nota3*0.35;

        if(promedio >= 3.0){
            estado = "Ganaste el curso";
        } else if(promedio >= 2.0){
            estado = "Debes habilitar el curso";
        } else if(promedio >= 0){
            estado = "Perdiste el curso";
        }
        System.out.println(promedio);
        return estado;
    }


    // @RequestParam: Este tipo de anotación se usa cuando los datos se envían como parámetros de consulta (en la URL) o en el cuerpo de la solicitud en un formato de formulario estándar (key-value) (a traves de HTML <form>). En este caso, @RequestParam extrae directamente los valores de esos parámetros y los pasa al metodo correspondiente.

    @PostMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        String mensaje = "Hola " + nombre;
        System.out.println(mensaje);
        return mensaje;
    }

    // @RequestBody: Cuando los datos se envían en formato JSON, se usa @RequestBody para indicar que el cuerpo de la solicitud contiene un objeto JSON que debe ser deserializado y mapeado a un objeto Java (Se instancia un objeto del tipo de dato especificado asignando los valores de los campos del objeto según el contenido del JSON - Debe coincidir los propiedades y sus tipo de valor tanto en el JSON como con la clase para un correcto mapeo).

    @PostMapping("/saludojson")
    public Empleado saludoJson(@RequestBody Empleado empleado) {
        System.out.println(empleado);
        return empleado;
    }
}

