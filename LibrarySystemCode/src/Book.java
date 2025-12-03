 public class Book {
        private String name;
        private String author;
        private String  category;
        private String publisher;

        public Book() {

        }

        public Book(String name, String author, String category, String publisher) {
            this.name = name;
            this.author = author;
            this.category = category;
            this.publisher = publisher;
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String  category) {
            this.category = category;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

     @Override
     public String toString() {
         return "Book{" +
                 "name='" + name + '\'' +
                 ", author='" + author + '\'' +
                 ", category='" + category + '\'' +
                 ", publisher='" + publisher + '\'' +
                 '}';
     }
 }
