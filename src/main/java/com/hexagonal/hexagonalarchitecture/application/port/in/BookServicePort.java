package com.hexagonal.hexagonalarchitecture.application.port.in;
import com.hexagonal.hexagonalarchitecture.domain.model.Book;

import java.util.List;


public interface BookServicePort {
    List<Book> getAllBooks();
    Book getBookById(String id);
    void addBook(Book book);
    void deleteBook(String id);
}

