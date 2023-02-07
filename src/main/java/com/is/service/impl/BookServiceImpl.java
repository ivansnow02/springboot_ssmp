package com.is.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.is.dao.BookDao;
import com.is.domain.Book;
import com.is.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
}
