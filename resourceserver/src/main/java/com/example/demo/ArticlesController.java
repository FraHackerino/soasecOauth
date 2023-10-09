package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticlesController {

    @Autowired
    private INotaService notaservice;

    public ArticlesController() {
    }

    @RequestMapping("/articles")
    public Iterable<Nota> getAll() {
        return notaservice.getAll();
    }
}

