//package com.example.Spring_project_new.project02.sarvices;
//
//import com.example.Spring_project_new.project02.entities.Book;
//import org.springframework.stereotype.Component;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class BookService {
//    private static List<Book> list=new ArrayList<>();
//    static {
//        list.add(new Book(12,"Java","XYZ"));
//        list.add(new Book(22,"Mysql","ABC"));
//        list.add(new Book(32,"Spring","RST"));
//    }
//    //get all book
//
//    public static List<Book> getList() {
//        return list;
//    }
//    //get single bookby id
//    public Book getBookById(int id){
//        Book book= null;
//        book = list.stream().filter(e -> e.getId()==id).findFirst().get();
//        return book;
//    }
//    //adding the book
//    public Book addBook(Book b){
//        list.add(b);
//        return b;
//    }
//    //Delete book
//    public void deleteBook(int bid){
//       list = list.stream().filter(book->{
//            if (book.getId()!=bid){
//                return true;
//            }else {
//                return false;
//            }
//        }).collect(Collectors.toList());
//    }
//
//    public List<Book> getAllBooks() {
//        return null;
//    }
//}
