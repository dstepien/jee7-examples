package pl.dawidstepien.jee.examples;

import java.util.logging.Logger;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Remote(BookService.class)
public class BookServiceBean implements BookService {

  @Inject
  Logger logger;

  @PersistenceContext(unitName = "defaultPersistenceUnit")
  private EntityManager entityManager;

  @Override
  public void createBook() {
    Book book = new Book();
    book.setTitle("Lord of the Rings");
    entityManager.persist(book);
    logger.info("Book created: " + book.getTitle());
  }
}
