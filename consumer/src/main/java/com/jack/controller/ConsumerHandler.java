package com.jack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Book> findAll() {
        return restTemplate.getForEntity("http://localhost:8010/book/findAll", Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Book> findAll2() {
        return restTemplate.getForObject("http://localhost:8010/book/findAll", Collection.class);
    }

}
