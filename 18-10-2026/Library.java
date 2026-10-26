import java.util.ArrayList;
import java.util.UUID;
import java.util.List;






public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();
    public Library(){
        this.bookList = bookList;

    }
    public String addBook(String title,String author){
        UUID id = UUID.randomUUID();
        String idAsString = id.toString();

        Book myBook = new Book(idAsString , title, author);
        this.bookList.add(myBook);
        return myBook.getId();


    }
    public List<Book> listAllBooks(){
        // for (Book book : this.bookList){
        //     return 
        // }
        return List.copyOf(this.bookList);
    }
    public Book searchById(String id){
        // boolean found = false;
        for(Book book : this.bookList){
            if (book.getId().equals(id)){
                // found = true;
                return book;
            }
        }
        
        return null;
        
    }
    public boolean issueBook(String id){
        Book found = searchById(id);

        if (found != null) {
            System.out.println("Found: " + found.getTitle());
            return found.issue();
        } else {
            System.out.println("Book not found");
            return false;
        }
    }
    public boolean returnBook(String id){
        Book found = searchById(id);

        if (found != null) {
            System.out.println("Found: " + found.getTitle());
            return found.returnBook();
        } else {
            System.out.println("Book not found");
            return false;
        }
    }
}
