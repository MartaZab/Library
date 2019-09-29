package book;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "borrower_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
