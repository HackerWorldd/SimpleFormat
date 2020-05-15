package library.services.books_service.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import library.services.books_service.domain.Book;

@Repository
//public interface BookRepository extends CrudRepository<Book, String> 
public interface BookRepository extends JpaRepository<Book, String> {
}

