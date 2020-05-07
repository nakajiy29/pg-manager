package com.example.demo.domain;

import java.time.Year;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String isbn;
    private String title;
    private String auhor;
    private String publisher;
    private Year issueYear;
}
