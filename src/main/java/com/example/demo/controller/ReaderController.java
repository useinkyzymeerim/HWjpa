package com.example.demo.controller;

import com.example.demo.model.Readers;
import com.example.demo.repo.ReaderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/readers")
public class ReaderController {


        private final ReaderRepo readerRepo;
        @GetMapping
        public List<Readers> getAllReaders() {

            return readerRepo.findAll();


        }
    }

