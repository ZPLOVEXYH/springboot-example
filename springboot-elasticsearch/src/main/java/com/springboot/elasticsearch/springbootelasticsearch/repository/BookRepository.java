package com.springboot.elasticsearch.springbootelasticsearch.repository;

import com.springboot.elasticsearch.springbootelasticsearch.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, Integer> {

    List<Book> findByBookNameLike(String message);
}
