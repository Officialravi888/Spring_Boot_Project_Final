//package com.example.Spring_project_new.project02.controller.Book;
//
//import com.example.Spring_project_new.project02.entities.Book;
//import com.example.Spring_project_new.project02.sarvices.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class Controller {
//    @Autowired
//    private BookService bookService;
//
//    //Get all book hendeler
//    @GetMapping("/books")
//    public List<Book> getBooks() {
//        return this.bookService.getAllBooks();
//    }
//
//    //one book acces ke ley
//    @GetMapping("/book/s{id}")
//    public Book getBook(@PathVariable("id") int id) {
//        return bookService.getBookById(id);
//    }
//
//    //New book hendler
//    @PostMapping("/books")
//    public Book addBook(@RequestBody Book book) {
//        Book b = this.bookService.addBook(book);
//        System.out.println(book);
//        return b;
//    }
//
//    //Delete book hendeler
//    @DeleteMapping("/Books")
//    public Book deleteBook(@PathVariable("bookId") int bookId) {
//        this.bookService.deleteBook(bookId);
//        return null;
//    }
//}