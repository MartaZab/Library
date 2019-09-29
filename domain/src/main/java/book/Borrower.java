package book;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "borrower")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

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
