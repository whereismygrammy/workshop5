package pl.coderslab.workshop5.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.workshop5.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class MemoryBookService implements BookService {

    private static int NEXT_ID = 1;
    private List<Book> list;

    public MemoryBookService() {
        list = new ArrayList<>();

        this.insertBook(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        this.insertBook(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        this.insertBook(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }

    @Override
    public List<Book> getList() {
        return list;
    }

    @Override
    public void setList(List<Book> list) {
        this.list = list;
    }

    @Override
    public void deleteById(Long id) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getId() == id) {
                this.list.remove(i);
                break;
            }
        }
    }

    @Override
    public Book getById(Long id) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getId() == id) {
                return this.list.get(i);
            }
        }
        return null;
    }

    @Override
    public void insertBook(Book book) {
        this.list.add(book);
        book.setId(NEXT_ID++);
    }

    @Override
    public void uppdateBook(Book book) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getId() == book.getId()) {
                this.list.set(i, book);
                break;
            }
        }
    }
}