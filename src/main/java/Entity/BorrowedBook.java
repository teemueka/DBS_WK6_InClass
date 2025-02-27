package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class BorrowedBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Timestamp borrowDate;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public BorrowedBook() {}

    public BorrowedBook(Book book, Student student) {
        this.borrowDate = new Timestamp(System.currentTimeMillis());
        this.book = book;
        this.student = student;
    }
}
