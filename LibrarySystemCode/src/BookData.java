import java.util.ArrayList;

public class BookData {
    private ArrayList<Book> books;

    public BookData() {
        books = new ArrayList<>();
       
        books.add(new Book("컴퓨터 구조", "신종홍", "001", "한빛"));
        books.add(new Book("Evolve", "anne", "002", "Cambridge"));
        books.add(new Book("정의란 무엇인가", "마이크 샌델", "003", "와이즈 베리"));
    }

    public void addbook(Book book) {
        books.add(book);
        System.out.println("추가가 완료되었습니다.");
    }

    public void serchBytitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                book.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void serchByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                book.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void serchBycategori(String categori) {
        boolean found = false;
        for (Book book : books) {
            if (book.getCode().equals(categori)) {
                book.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }
}