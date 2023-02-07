package com.is.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.is.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage, int pageSize);
}
