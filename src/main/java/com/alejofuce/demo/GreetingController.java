package com.alejofuce.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping()
    Greeting greeting(@RequestParam (defaultValue = "") String university, String asignature, String name, String period, String language, String dream) {
        return new Greeting(counter.incrementAndGet(), String.format(template, university = "UTPL"), String.format(template, asignature = "Procesos de Ingeniería de Software"), String.format(template, name = "Alejandro Fuertes"), String.format(template, period = "Abr/Ago 2021"), String.format(template, language = "C#"), String.format(template, dream = "Maestría en desarrollo de videojuegos"));
    }
}
