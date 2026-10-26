

public class Document {
    private String id ;
    private String title;
    
    
    Document(String id , String title){
        this.id=id;
        this.title=title;

    }
    
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
}
