package book;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Entity
@Table(name = "borrower_details")
public class BorrowerDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_borrower_details", length = 20)
    private Long idBorrowerDetails;

    @Column(name = "address", nullable = false, length = 40)
    private String address;

    @Column(name = "email", nullable = false, length = 40)
    private String email;

    @Column(name = "phone", nullable = false, length = 40)
    private String phone;

    @OneToOne(mappedBy = "details")
    private Borrower borrower;
}
