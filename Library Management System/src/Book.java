


public class Book {


    private String title;

    private String author;

    private int isbn;

    private boolean status;


    public Book(String title, String author, int isbn, boolean status) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }

    public Book() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {

        if (isStatus()){
            return "Title : " + title + "\n" +
                    "Author : '" + author + "\n" +
                    "ISBN : " + isbn+ "\n" +
                    "Status : Available" ;
        }else{
            return "Title : " + title + "\n" +
                    "Author : '" + author + "\n" +
                    "ISBN : " + isbn + "\n" +
                    "Status : Unavailable" ;
        }

    }



}
