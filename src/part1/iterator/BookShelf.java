package part1.iterator;

public class BookShelf {
    private Book[] books;
    private int last;
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }

    public Book getBook(int index){
        return books[index];
    }

    public void addBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
