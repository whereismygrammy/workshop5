package pl.coderslab.workshop5.beans;

import org.springframework.stereotype.Service;
import pl.coderslab.workshop5.model.Book;

import java.util.List;

@Service
public class DbBookService implements BookService {
    @Override
    public List<Book> getList() {
        return null;
    }

    @Override
    public void setList(List<Book> list) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Book getById(Long id) {
        return null;
    }

    @Override
    public void insertBook(Book book) {

    }

    @Override
    public void uppdateBook(Book book) {

    }
}
