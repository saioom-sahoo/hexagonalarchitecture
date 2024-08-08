package com.hexagonal.hexagonalarchitecture.infrastructure.adapters.in;

import com.hexagonal.hexagonalarchitecture.application.port.in.BookServicePort;
import com.hexagonal.hexagonalarchitecture.domain.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookServicePort bookServicePort;

    public BookController(BookServicePort bookServicePort) {
        this.bookServicePort = bookServicePort;
    }


    @GetMapping
    public List<Book> getAllBooks() {
        return bookServicePort.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable String id) {
        return bookServicePort.getBookById(id);
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookServicePort.addBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        bookServicePort.deleteBook(id);
    }
}