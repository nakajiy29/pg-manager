package com.example.demo.domain;

import java.time.Year;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
    private String isbn;
    private String title;
    private String auhor;
    private String publisher;
    private Year issueYear;
    private String keyword;
    private String remark;
}
