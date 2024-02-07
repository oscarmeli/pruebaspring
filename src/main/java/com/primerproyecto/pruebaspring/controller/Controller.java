package com.primerproyecto.pruebaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hola")
    public String sayHello(){

        return "Hola Mundo";
    }
}
