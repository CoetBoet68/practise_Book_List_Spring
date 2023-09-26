package practice.demo.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String Company_Name;
    private String adressLine1;
    private String city;
    private String state;
    private String zip;

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books =new HashSet<>();

    public Publisher() {
    }

    public Publisher(String company_Name, String adressLine1, String city, String state, String zip) {
        Company_Name = company_Name;
        this.adressLine1 = adressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public void setCompany_Name(String company_Name) {
        Company_Name = company_Name;
    }

    public String getAdressLine1() {
        return adressLine1;
    }

    public void setAdressLine1(String adressLine1) {
        this.adressLine1 = adressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Publisher publisher = (Publisher) o;
        return Objects.equals(Id, publisher.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Publisher{" +
            "Id=" + Id +
            ", Company_Name='" + Company_Name + '\'' +
            ", adressLine1='" + adressLine1 + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", zip='" + zip + '\'' +
            '}';
    }
}
