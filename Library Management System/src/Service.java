import java.util.ArrayList;
import java.util.List;

public class Service {


    List<Book> bookList = new ArrayList<>();


    public void add_Book(String title,String author,int isbn){

        Book book = new Book(title,author,isbn,true);

        bookList.add(book);

        System.out.println("Book has been added.");

    }


    public void issue_Book(String name){

        for (Book book: bookList){

            if (name.equals(book.getTitle())){

                book.setStatus(false);

            }

        }


    }

    public void return_Book(String name){

        for (Book book: bookList){

            if (name.equals(book.getTitle())){

                book.setStatus(true);

            }

        }


    }




    public void search_Book(String name){

        for (Book book: bookList){

            if (name.equals(book.getTitle())){

                System.out.print("Book Found!!! \n");
                System.out.print("Title : " + book.getTitle()+
                        "\nAuthor : " + book.getAuthor()+
                        "\nISBN : " + book.getIsbn());

            }

        }

    }


    public void view_all_Book(){

        for (Book book: bookList){
            System.out.println(book.toString() + "\n\n");
        }

    }




}
