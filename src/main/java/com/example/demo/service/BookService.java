package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Book;
import com.example.demo.mapper.BookMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {
    private final BookMapper bookMapper;

    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @Transactional
    public void save(Book book) {
        bookMapper.save(book);
    }

    public List<Book> search(String keyword) {
        List<Book> list = bookMapper.search(keyword);
        list.forEach(book -> log.info("book = {}", book));
        return list;
    }
}
