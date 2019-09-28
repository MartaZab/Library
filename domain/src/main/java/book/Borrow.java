package book;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Entity
@Table(name = "borrow")
public class Borrow implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_borrow", length = 20)
    private Long idBorrow;

    @Column(name = "rental_date", nullable = false)
    private Date rentalDate;

    @ManyToOne
    @JoinColumn(name = "borrow_id")
    private Borrower borrower;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
