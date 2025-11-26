import java.util.ArrayList;

public class Bookdata {
    private ArrayList<book> books;
    public Bookdata() {
        books = new ArrayList<>();

        books.add(new book("컴퓨터 구조", "신종홍", "001", "한빛"));
        books.add(new book("Evolve", "anne", "002", "길벗"));
        books.add(new book("정의란 무엇인가", "마크 샌더스", "003", "한길"));
    }

    public void addbook(book book) {
        books.add(book);
        System.out.println("추가가 완료되었습니다.");
    }

    public void serchBytitle(String title) {
        boolean found = false;
        for (book book : books) {
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
        for (book book : books) {
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
        for (book book : books) {
            if (book.getCode().equals(categori)) {
                book.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void addBook(book book) {
        books.add(book);
    }
}