package part1.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("java"));
        bookShelf.addBook(new Book("javascript"));
        bookShelf.addBook(new Book("mysql"));
        bookShelf.addBook(new Book("design pattern"));

        Iterator iterator = new BookShelfIterator(bookShelf);

        for(; iterator.hasNext();){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}


/*
* iterator pattern의 등장 인물
* 1. iterator interface  (hasNext(),next()를 정의)
* 2. 구체적인 iterator (implements iterator interface)
* 3. aggregate,구체적인 aggregate (iterate할 대상)
* */


/*
* iterator 패턴 쓰는 이유
* 변경이 일어나도 aggregate 클래스와 iterator를 서로 독립적으로 다룰 수 있다.
* aggegate인 BookShelf의 books가 ArrayList나 다른 종류로 바뀐다고 해도 iterator는 수정하지 않아도 된다.
* */