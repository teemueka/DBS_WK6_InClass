package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Biography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;
    private String details;

    public Biography() {}
    public Biography(Author author, String details) {
        this.author = author;
        this.details = details;
    }
}
