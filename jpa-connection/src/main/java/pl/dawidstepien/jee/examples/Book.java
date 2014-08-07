package pl.dawidstepien.jee.examples;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
        @NamedQuery(name = "findAllBooks", query = "SELECT book FROM Book book"),
        @NamedQuery(name = "findBookH2G2", query = "SELECT book FROM Book book WHERE book.title = 'H2G2'")
})
public class Book {

  @Id @GeneratedValue
  private long id;

  @NotNull
  private String title;

  private Float price;

  @Size(min = 10, max = 2000)
  private String description;

  private String isbn;

  private Integer numberOfPage;

  private Boolean illustrations;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Integer getNumberOfPage() {
    return numberOfPage;
  }

  public void setNumberOfPage(Integer numberOfPage) {
    this.numberOfPage = numberOfPage;
  }

  public Boolean getIllustrations() {
    return illustrations;
  }

  public void setIllustrations(Boolean illustrations) {
    this.illustrations = illustrations;
  }
}
