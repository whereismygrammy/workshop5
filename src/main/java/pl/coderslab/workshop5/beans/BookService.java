package pl.coderslab.workshop5.beans;

import pl.coderslab.workshop5.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getList();

    void setList(List<Book> list);

    void deleteById(Long id);

    Book getById(Long id);

    void insertBook(Book book);

    void uppdateBook(Book book);

}
