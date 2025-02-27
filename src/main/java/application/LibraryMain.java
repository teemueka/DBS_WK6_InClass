package application;

import Entity.*;
import dao.LibraryDAO;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryDAO dao = new LibraryDAO();

        // sample data
        Student student1 = new Student("student1");
        Student student2 = new Student("student2");
        Student student3 = new Student("student3");

        Book book1 = new Book("book1title");
        Book book2 = new Book("book2title");
        Book book3 = new Book("book3title");

        Author author1 = new Author("author1");
        Author author2 = new Author("author2");
        Author author3 = new Author("author3");

        dao.save(student1);
        dao.save(student2);
        dao.save(student3);
        dao.save(book1);
        dao.save(book2);
        dao.save(book3);
        dao.save(author1);
        dao.save(author2);
        dao.save(author3);

        Biography biography1 = new Biography(author1, "author1details");
        Biography biography2 = new Biography(author2, "author2details");
        Biography biography3 = new Biography(author3, "author3details");

        dao.save(biography1);
        dao.save(biography2);
        dao.save(biography3);

        BorrowedBook borrowedBook1 = new BorrowedBook(book1, student1);
        BorrowedBook borrowedBook2 = new BorrowedBook(book2, student2);
        BorrowedBook borrowedBook3 = new BorrowedBook(book3, student3);

        dao.save(borrowedBook1);
        dao.save(borrowedBook2);
        dao.save(borrowedBook3);
    }
}
