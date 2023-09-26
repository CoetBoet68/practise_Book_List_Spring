package practice.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.demo.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
