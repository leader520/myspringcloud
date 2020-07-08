package com.jack.controller;

import com.jack.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Book> findAll() {
        return restTemplate.getForEntity("http://localhost:8010/book/findAll",Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Book> findAll2() {
        return restTemplate.getForObject("http://localhost:8010/book/findAll",Collection.class);
    }
}
