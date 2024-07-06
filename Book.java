public class Book{
    int numberOfBooks;
    String bookName;
    int bookPrice;
    String authorName;

    public Book(){
        numberOfBooks = 100;
    }

    public Book(String name){
        bookName = name;
    }

    public Book(int price,String author){
        bookPrice = price;
        authorName = author;
    }

    public static void main(String[] args){
        Book numbers = new Book();
        System.out.println(numbers.numberOfBooks);

        Book nameOfBook = new Book("War And Peace");
        System.out.println(nameOfBook.bookName);

        Book priceAndAuthor = new Book(299,"Leo Tolstoy");
        System.out.println(priceAndAuthor.bookPrice + "," + priceAndAuthor.authorName);
    }

                  






}