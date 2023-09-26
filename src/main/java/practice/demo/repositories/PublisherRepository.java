package practice.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import practice.demo.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
