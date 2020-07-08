package com.jack.feign;

import com.jack.entity.Book;
import com.jack.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider1",fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/book/findAll")
    public Collection<Book> findAll();

}
