package com.yourcompany.yourapp.web.rest;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookResource {

    private final BookService authorService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }
}
