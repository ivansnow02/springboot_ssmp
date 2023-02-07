package com.is.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.is.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private IBookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(4));
    }

    void testSave() {
        Book book = new Book();
        book.setName("测试数据1");
        book.setType("测试数据1");
        book.setDescription("测试数据1");
        bookService.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(2);
        book.setName("测试数据改");
        book.setType("测试数据");
        book.setDescription("测试数据");
        bookService.updateById(book);
    }

    @Test
    void testDelete() {
        bookService.removeById(3);
    }

    @Test
    void testGetAll() {
        bookService.list();
    }

    @Test
    void testGetPage() {
        IPage<Book> page = new Page<Book>(1,5);
        bookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());//最大页码值
        System.out.println(page.getRecords());
    }

}
