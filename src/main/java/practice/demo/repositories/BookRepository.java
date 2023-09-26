package practice.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.demo.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
