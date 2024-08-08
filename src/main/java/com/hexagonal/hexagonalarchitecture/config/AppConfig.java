package com.hexagonal.hexagonalarchitecture.config;


import com.hexagonal.hexagonalarchitecture.application.port.in.BookServicePort;
import com.hexagonal.hexagonalarchitecture.application.port.out.BookRepository;
import com.hexagonal.hexagonalarchitecture.infrastructure.adapters.out.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BookServicePort bookServicePort(BookRepository bookRepository) {
        return new BookServiceImpl(bookRepository);
    }
}

