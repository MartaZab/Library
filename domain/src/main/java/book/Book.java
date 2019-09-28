package book;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book", length = 20)
    private Long idBook;

    @Column(name = "borrow", nullable = false, length = 5)
    private boolean borrow;

    @Column(name = "category", nullable = false, length = 15)
    private String category;

    @Column(name = "isbn", nullable = false, length = 15)
    private String isbn;

    @Column(name = "pages", nullable = false, length = 5)
    private Integer pages;

    @Column(name = "release_date", nullable = false)
    private Date releaseDate;

    @Column(name = "summary", nullable = false, length = 350)
    private String summary;

    @Column(name = "title", nullable = false, length = 200)
    private String title;


    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany(mappedBy = "borrow")
    private List<Borrow> borrows;

}
