package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.Book;

@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAll();
}
