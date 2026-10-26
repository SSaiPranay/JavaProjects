
import java.util.HashMap;
import java.util.ArrayList;

public class DocumentRegistry{

    private ArrayList<Document> documents = new ArrayList<>();
    private HashMap<String,Document> docs = new HashMap<>();


    public boolean addDocument(Document document, String typeStore){
        if (typeStore.equals("list")){
            if (document!= null){
                if (findById(document.getId(),"list")!=null){
                    System.out.println("Duplicate ID found");
                    return false;

                }
                else{
                    documents.add(document);
                    return true;
                }
            }
            else{
                return false;
            }
        }
        else{
            //code for the haspmap document put
            if (document!=null){
                if (findById(document.getId(),"hash")!=null){
                    System.out.println("Duplicate ID found");
                    return false;

                }
                else{
                    docs.put(document.getId(),document);
                    return true;
                }
            }
            else{
                return false;
            }
            
        }
    }
    public void listAllDocuments(String typeStore){
        if (typeStore.equals("list")){
            for (Document document : documents){
                System.out.println(document.getId()+ ","+document.getTitle());
            }
        }
        else{
            System.out.println(docs);
        }

    }
    public Document findById(String id,String typeStore){
        if (typeStore.equals("list")){
            for (Document document : documents){
                if (id.equals(document.getId())){
                    return document;
                }
            }
            return null;
        }
        else{
            //code for finding in hashmap
            Document found = docs.get(id);
            if(found != null){
                return found;
            }
            else{
                return null;
            }
        }

    }
    
}
