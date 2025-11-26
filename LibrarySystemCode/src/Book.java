public class book {
    private String title;
    private String author;
    private String code;
    private String publisher;
     

 
    public book(String title, String author, String code, String publisher) {
        this.title = title;
        this.author = author;
        this.code = code;
        this.publisher = publisher;
    }

   
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCode() { return code; }
    public String getPublisher() {return publisher; }

  
    public void printInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("카테고리: " + code);
        System.out.println("출판사: " + publisher);
        System.out.println("-------------------------");
    }
}
