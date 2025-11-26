import java.util.ArrayList;

public class Bookdata {
    private ArrayList<book> books;
    public Bookdata() {
        books = new ArrayList<>();

        books.add(new book("컴퓨구조", "�종, "001", "�빛"));
        books.add(new book("Evolve", "anne", "002", "길벗"));
        books.add(new book("�의� 무엇��", "마크 �더, "003", "�길"));
    }

    public void addbook(book book) {
        books.add(book);
        System.out.println("추�가 �료�었�니");
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
            System.out.println("검결과가 �습�다.");
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
            System.out.println("검결과가 �습�다.");
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
            System.out.println("검결과가 �습�다.");
        }
    }

    public void addBook(book book) {
        books.add(book);
    }
}