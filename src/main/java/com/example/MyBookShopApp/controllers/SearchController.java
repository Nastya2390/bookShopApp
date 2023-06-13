package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SearchController {

    private final BookService bookService;

    @ModelAttribute("bookList")
    public List<Book> bookList() {
        return bookService.getBooksData();
    }

    @GetMapping("/search")
    public String searchPage() {
        return "/search/index";
    }

}
