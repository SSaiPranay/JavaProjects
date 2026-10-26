
public class Book{
    // ID
    // Title
    // Author
    // Availability
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;


    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        
        // A newly added book automatically starts as available (true)
        this.isAvailable = true; 
    }
    public boolean isAvailable(){
        return this.isAvailable;
    }
    public String getId(){
        return this.id;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public boolean issue(){
        if (this.isAvailable==true){
            this.isAvailable=false;
            return true;
        }
        else{
            return false;
        }

    }
    public boolean returnBook(){
        if (this.isAvailable==false){
            this.isAvailable=true;
            return true;
        }
        else{
            return false;
        }

    }
}
