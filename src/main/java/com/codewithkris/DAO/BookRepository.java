package com.codewithkris.DAO;

import com.codewithkris.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
