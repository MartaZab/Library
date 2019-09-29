package book;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_author")
    private Long idAuthor;

    @Column(name = "first_name", nullable = false, length = 15)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 15)
    private String lastName;

    @Column(name = "birth_place")
    private String birthPlace;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

}
