package com.is.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.is.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void testSelectById() {
        System.out.println(bookDao.selectById(1));
    }
    @Test
    void testSave() {
        Book book = new Book();
        book.setName("测试数据");
        book.setType("测试数据");
        book.setDescription("测试数据");
        bookDao.insert(book);
    }
    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(2);
        book.setName("测试数据改");
        book.setType("测试数据");
        book.setDescription("测试数据");
        bookDao.updateById(book);
    }
    @Test
    void testDelete() {
        bookDao.deleteById(3);
    }
    @Test
    void testGetAll() {
        bookDao.selectList(null);
    }
    @Test
    void testGetPage() {
        IPage<Book> page = new Page<Book>(1,5);
        bookDao.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());//最大页码值
        System.out.println(page.getRecords());
    }
    @Test
    void testGetBy() {

    }

}
