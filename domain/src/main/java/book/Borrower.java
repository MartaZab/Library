package book;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Table(name = "borrower")
public class Borrower implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_borrower", length = 20)
    private Long idBorrower;

    @Column(name = "first_name", nullable = false, length = 10)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 10)
    private String lastName;

    @OneToOne
    @JoinColumn(name = "borrower_details")
    private BorrowerDetails details;

    @OneToMany(mappedBy = "borrower")
    private List<Borrow> borrows;


}
