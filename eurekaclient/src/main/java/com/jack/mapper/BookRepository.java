package com.jack.mapper;

import com.jack.entity.Book;
import java.util.List;

/**
 * @author HWJ
 * @version 1.0
 *
 *
 *   */
public interface BookRepository {
    public List<Book> findAll();
    public Book findById(long id);
    public void save(Book book);
    public void update(Book book);
    public void deleteById(long id);
}
