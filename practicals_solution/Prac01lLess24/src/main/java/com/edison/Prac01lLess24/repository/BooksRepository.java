package com.edison.Prac01lLess24.repository;
import org.springframework.data.repository.CrudRepository;

import com.edison.Prac01lLess24.model.Books;



public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
