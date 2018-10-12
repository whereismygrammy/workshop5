package pl.coderslab.workshop5.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.workshop5.beans.MemoryBookService;
import pl.coderslab.workshop5.model.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private MemoryBookService memoryBookService;

    @GetMapping("/hello")
    public String hello() {
        return "{hello: World}";
    }

    @GetMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    @GetMapping("")
    public List<Book> getBookList(){
        return memoryBookService.getList();
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable long id){
        this.memoryBookService.deleteById(id);
        return "{\"status\" : \"ok\"}";

    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id){
        return this.memoryBookService.getById(id);

    }

}