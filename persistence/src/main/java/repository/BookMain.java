package repository;

import book.Book;

public class BookMain {
    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepository();

        Book book = new Book();
        book.setTitle("Pan Tadeusz");
        book.setPages(234);
        book.setIsbn("97979879798789");

        bookRepository.create(book);
        System.out.println("Book saved");
    }
}
