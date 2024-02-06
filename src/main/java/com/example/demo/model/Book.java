package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookName;
    private String authorName;
    private Date publishedData;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] bookPhoto;
}
