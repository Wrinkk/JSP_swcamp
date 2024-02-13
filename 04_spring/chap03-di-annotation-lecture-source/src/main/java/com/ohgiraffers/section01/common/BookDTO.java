package com.ohgiraffers.section01.common;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookDTO {

    private int sequence;
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private Date createDate;
}
