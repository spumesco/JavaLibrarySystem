import java.util.Scanner;

public class Search extends BookData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("검색 방법을 선택하세요: 1. 도서청구기호  2. 제목  3. 저자");
        int choice = sc.nextInt();
        sc.nextLine(); // 개행문자 제거

        boolean found = false;
        switch (choice) {
            case 1:
                System.out.print("도서청구기호를 입력하세요: ");
                String callNum = sc.nextLine();
                for (Book book : books) {
                    if (book.callNumber.equals(callNum)) {
                        book.printInfo();
                        found = true;
                        break;
                    }
                }
                break;
            case 2:
                System.out.print("제목을 입력하세요: ");
                String title = sc.nextLine();
                for (Book book : books) {
                    if (book.title.equals(title)) {
                        book.printInfo();
                        found = true;
                        break;
                    }
                }
                break;
            case 3:
                System.out.print("저자를 입력하세요: ");
                String author = sc.nextLine();
                for (Book book : books) {
                    if (book.author.equals(author)) {
                        book.printInfo();
                        found = true;
                        break;
                    }
                }
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }

        if (!found) {
            System.out.println("해당 정보를 찾을 수 없습니다.");
        }
    }
}