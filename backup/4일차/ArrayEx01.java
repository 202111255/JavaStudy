class Book {
    String title;
    String author;
    String price;

    Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class ArrayEx01 {
    public static void main(String[] args) {
        //기본 자료형 배열
        //int[] intArray = new int[] {10, 20, 30};

        //참조 자료형 배열
        Book book1 = new Book("Java", "홍길동", "1000");
        Book book2 = new Book("JSP", "박문수", "2000");
        Book book3 = new Book("Spring", "이몽룡", "3000");

        Book[] bookArray = new Book[3];
        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;

        System.out.println("권수 : " + bookArray.length);
    

        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].title);
            System.out.println(bookArray[i].author);
        }
 
    }
}
