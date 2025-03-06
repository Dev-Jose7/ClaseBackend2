package com.example.demoEndPoint.controller;

import com.example.demoEndPoint.Model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/product")
    public String product(){
        return "Product";
    }

    @GetMapping("/user/{username}/{password}")
    public HashMap<String, Object> login(@PathVariable String username, @PathVariable String password) {
        // Asignar el contenido de los datos recibidos a un objeto de tipo HashMap
        HashMap<String, Object> oJson = new HashMap<>();

        oJson.put("password", password);
        oJson.put("username", username);
        return oJson;
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestParam String code, @RequestParam String name){
        Product product = new Product(code, name);
        System.out.println(product);
        return product;
    }

    @PostMapping("/addProduct2")
    public Product addProduct2(@RequestBody Product product){
        System.out.println(product);
        return product;
    }
}
