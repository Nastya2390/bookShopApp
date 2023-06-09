package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MainPageController {

    private final BookService bookService;

    public MainPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("bookList")
    public List<Book> bookList() {
        return bookService.getBooksData();
    }

    @GetMapping("/bookshop/main")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/")
    public String mainPageDefault() {
        return "index";
    }

    @GetMapping("/books/recent")
    public String recentBooksPage() {
        return "/books/recent";
    }

    @GetMapping("/books/popular")
    public String popularBooksPage() {
        return "/books/popular";
    }

    @GetMapping("/postponed")
    public String postponedBooksPage() {
        return "/postponed";
    }

}
