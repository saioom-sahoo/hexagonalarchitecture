package com.hexagonal.hexagonalarchitecture.application.port.out;


import com.hexagonal.hexagonalarchitecture.domain.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
}
