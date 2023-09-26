package practice.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import practice.demo.domain.Author;
import practice.demo.domain.Book;
import practice.demo.domain.Publisher;
import practice.demo.repositories.AuthorRepository;
import practice.demo.repositories.BookRepository;
import practice.demo.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

            Publisher penguin = new Publisher("Penguin","12 Dunno Street", "New York", "Orange", "44200");
            publisherRepository.save(penguin);
            Author eric = new Author("Eric", "Langley");
            Book ddd = new Book("Eric's Book", "EricIBN1");
            eric.getBooks().add(ddd);
            ddd.getAuthors().add(eric);
            penguin.getBooks().add(ddd);
            ddd.setPublisher(penguin);

            authorRepository.save(eric);
            bookRepository.save(ddd);

            Author jerome = new Author("Jerome", "DoMore");
            Book jjj = new Book("J's Book", "JIBN1");
            eric.getBooks().add(jjj);
            jjj.getAuthors().add(jerome);
            penguin.getBooks().add(jjj);
            jjj.setPublisher(penguin);

            authorRepository.save(jerome);
            bookRepository.save(jjj);
            publisherRepository.save(penguin);

            System.out.println("Bootstrap Initialization");
            System.out.println("Number of Books: " + bookRepository.count());
            System.out.println(penguin.getCompany_Name()+ " has " + penguin.getBooks().size() + " books");



    }
}
