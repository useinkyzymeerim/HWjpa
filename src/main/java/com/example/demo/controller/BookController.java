package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

        private final BookService bookService;

        @Autowired
        public BookController(BookService bookService) {
            this.bookService = bookService;
        }

        @GetMapping
        public ResponseEntity<List<Book>> getAllBooks() {
            List<Book> books = bookService.getAllBooks();
            return ResponseEntity.ok(books);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Book> getBookById(@PathVariable int id) {
            Book book = bookService.getBookById(id);
            return ResponseEntity.ok(book);
        }

        @PostMapping
        public ResponseEntity<String> saveBook(@RequestBody Book bookRequest) {
            bookService.saveBook(bookRequest);
            return ResponseEntity.ok("Book saved successfully!");
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteBook(@PathVariable int id) {
            bookService.deleteBook(id);
            return ResponseEntity.ok("Book deleted successfully!");
        }
    }
