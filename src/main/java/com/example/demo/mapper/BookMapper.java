package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.Book;

@Mapper
public interface BookMapper {
    @Select("select * from book")
    List<Book> findAll();

    @Insert("insert into book (isbn, title, auhor, publisher, issue_year, keyword, remark) values (#{isbn}, #{title}, #{auhor}, #{publisher}, #{issueYear}, #{keyword}, #{remark})")
    @Options(useGeneratedKeys = true)
    void save(Book book);

    @Select("select * from book where keyword like concat('%', #{keyword}, '%')")
    List<Book> search(String keyword);
}
