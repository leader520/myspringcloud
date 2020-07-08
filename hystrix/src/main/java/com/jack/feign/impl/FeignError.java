package com.jack.feign.impl;

import com.jack.entity.Book;
import com.jack.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Book> findAll() {
        return null;
    }
}
