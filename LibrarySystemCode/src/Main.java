import java.awt.print.Book;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bookdata data = new Bookdata();

        while (true) {

            System.out.println("실행할 메뉴를 선택하세요");
            System.out.println("1.도서 저장");
            System.out.println("2. 제목 검색");
            System.out.println("3. 저자 검색");
            System.out.println("4. 카테고리 검색");
            System.out.println("0. 종료");

            int main = sc.nextInt();
            sc.nextLine();
            switch (main) {
                case 1:
                    System.out.println("제목 입력:");
                    String title = sc.nextLine();
                    System.out.println("저자 입력:");
                    String author = sc.nextLine();
                    System.out.println("카테고리 입력");
                    String categori = sc.nextLine();
                    System.out.println("출판사 입력");
                    String publisher = sc.nextLine();

                    System.out.println("\n===== " + title + " / " + author + " / " + categori + "/" + publisher + " =====");
                    Book newbook = new Book(title, author, categori, publisher);
                    data.addBook(newbook);
                    break;
            }
            switch (main) {
                case 2:
                    System.out.println("제목 입력");
                    String title = sc.nextLine();
                    data.serchBytitle(title);
                    break;

                case 3:
                    System.out.println("저자 입력");
                    String author = sc.nextLine();
                    data.serchByAuthor(author);
                    break;

                case 4:
                    System.out.println("카테고리 입력");
                    String categori = sc.nextLine();
                    data.serchBycategori(categori);
                    break;

                case 0:
                    System.out.println("종료 되었습니다.");
                    return;

                default:
                    System.out.println("도서 추가가 완료되었습니다.");
            }

        }
    }
}