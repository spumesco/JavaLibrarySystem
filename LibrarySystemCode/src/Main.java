import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, ArrayList<Object>> bookMap = new TreeMap<>();

        addBook(bookMap, "978-33-003", "해리포터", "롤링", 20000, "판타지");
        addBook(bookMap, "978-11-001", "자바의 정석", "남궁성", 30000, "IT");
        addBook(bookMap, "978-22-002", "채식주의자", "한강", 15000, "소설");

        // 3. 데이터 출력
        System.out.println("========= 도서 목록 (ISBN 정렬됨) =========");

        Set<String> isbnSet = bookMap.keySet();

        for (String isbn : isbnSet) {
            // Key(isbn)를 이용해 Value(ArrayList)를 가져옴
            ArrayList<Object> infoList = bookMap.get(isbn);

            // ArrayList에서 인덱스로 데이터 꺼내기 (형변환 필요)
            String title = (String) infoList.get(0);
            String author = (String) infoList.get(1);
            int price = (int) infoList.get(2);
            String category = (String) infoList.get(3);

            // 출력 포맷
            System.out.printf("[ISBN: %s] %s | %s | %,d원 | %s\n",
                    isbn, title, author, price, category);
        }
    }

    // 맵에 데이터를 편하게 넣기 위한 도우미 메서드
    public static void addBook(TreeMap<String, ArrayList<Object>> map,
                               String isbn, String title, String author, int price, String category) {

        // 1. 정보를 담을 리스트 생성
        ArrayList<Object> list = new ArrayList<>();

        // 2. 리스트에 순서대로 정보 추가
        list.add(title);    // index 0
        list.add(author);   // index 1
        list.add(price);    // index 2
        list.add(category); // index 3

        // 3. 맵에 저장 (Key: isbn, Value: list)
        map.put(isbn, list);
    }
}
