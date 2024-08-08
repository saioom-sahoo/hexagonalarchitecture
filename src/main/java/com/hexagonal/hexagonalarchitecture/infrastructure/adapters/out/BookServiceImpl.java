package com.hexagonal.hexagonalarchitecture.infrastructure.adapters.out;


import com.hexagonal.hexagonalarchitecture.application.port.in.BookServicePort;
import com.hexagonal.hexagonalarchitecture.application.port.out.BookRepository;
import com.hexagonal.hexagonalarchitecture.domain.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookServicePort {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(String id) {
        return bookRepository.findById(Long.parseLong(id)).orElse(null);
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(Long.parseLong(id));
    }
}