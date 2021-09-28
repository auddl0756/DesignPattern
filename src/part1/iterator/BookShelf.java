package part1.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> books;

    public BookShelf(){
        this.books = new ArrayList<>();
    }

    public Book getBook(int index){
        //return books[index];
        return books.get(index);
    }

    public void addBook(Book book){
        //this.books[last] = book;
        this.books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
