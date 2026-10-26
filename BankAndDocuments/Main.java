import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void withdrawPrint(boolean act,BankAccount bankObj){
            if (act){
                System.out.println("successfully");
            }
            else{
                System.out.println("invalid");
            }
            System.out.println("The Balance is :"+bankObj.getBalance() );
        }
    public static void main(String[] args){
        

        System.out.println("Hello, World!");
        // //THIS IS FOR THE BANK ACCOUNT
        // //creating object with initial balance of 500
        // BankAccount bankObj = new BankAccount(500);
        // //getting balance
        // double bal = bankObj.getBalance();
        // System.out.println(bal);
        // //depositing 220 into the account
        // boolean act=bankObj.deposit(222);
        // withdrawPrint(act,bankObj);
        


        // //withdrawing amount
        // boolean act1 = bankObj.withdraw(200);
        // withdrawPrint(act1,bankObj);
        // boolean act2 = bankObj.withdraw(400);
        // withdrawPrint(act2,bankObj);
        // boolean act3 = bankObj.withdraw(-50);
        // withdrawPrint(act3,bankObj);
        // boolean act4 = bankObj.withdraw(300);
        // withdrawPrint(act4,bankObj);

        // BankAccount invalidAccount = new BankAccount(-100);

        // // //THIS IS FIR THE DOCUMENT REGISTERY
        // DocumentRegistry docRegObj = new DocumentRegistry();
        // System.out.println("The initial list is :  ");
        // docRegObj.listAllDocuments();
        // Document docObj = new Document("DOC-001", "Java Notes");
        // // System.out.println(docObj.getId()+","+docObj.getTitle());
        // docRegObj.addDocument(docObj);
        // System.out.print("The updtaed list is :  ");
        // docRegObj.listAllDocuments();
        // Document docObj1 = new Document("DOC-001", "Python Notes");
        // // System.out.println(docObj1.getId()+","+docObj1.getTitle());
        // docRegObj.addDocument(docObj1);
        // System.out.print("The updtaed list is :  ");
        // docRegObj.listAllDocuments();

        // System.out.println("Searching starts :::::: ");
        // Document df = docRegObj.findById("DOC-001");
        // if (df!=null){
        //     System.out.println("Document found!"+"     "+df.getId()+","+df.getTitle());
        // }
        // else{
        //     System.out.println("Document Not Found");
        // }



        /////THIS IS FOR THE HASHMAP PRACTISE
        // Document doc = new Document("DOC-001","Csharp notes" );
        // Document doc1 = new Document("DOC-002","Csharp notes1" );
        // Document doc2 = new Document("DOC-001","Csharp notes2" );
        // HashMap<String, Document> documentsById = new HashMap<>();

        // documentsById.put(doc.getId(),doc);
        // documentsById.put(doc1.getId(),doc1);
        // documentsById.put(doc2.getId(),doc2);

        // Document found =documentsById.get("DOC-001");
        // System.out.println(found);
        // System.out.println(documentsById.containsKey("DOC-001")); // true
        // System.out.println(documentsById.containsKey("DOC-999") );// false

        // System.out.println(documentsById.size());
        

        // HashSet<String> ids = new HashSet<>();

        // ids.add("DOC-001");
        // ids.add("DOC-002");
        // ids.add("DOC-001"); // duplicate; set still has one DOC-001


        // // Print the entire HashMap
        // System.out.println("\n--- HashMap directly ---");
        // System.out.println(documentsById);

        // // Print key-value pairs with readable document details
        // System.out.println("\n--- HashMap entries ---");
        // for (Map.Entry<String, Document> entry : documentsById.entrySet()) {
        //     Document value = entry.getValue();

        //     System.out.println(
        //         entry.getKey() + " -> " +
        //         value.getId() + ", " +
        //         value.getTitle()
        //     );
        // }

        // // Print only keys and values
        // System.out.println("\n--- HashMap keys ---");
        // System.out.println(documentsById.keySet());

        // System.out.println("\n--- HashMap values ---");
        // for (Document value : documentsById.values()) {
        //     System.out.println(value.getId() + ", " + value.getTitle());
        // }

        // // Print the entire HashSet
        // System.out.println("\n--- HashSet directly ---");
        // System.out.println(ids);

        // // Print each set element
        // System.out.println("\n--- HashSet elements ---");
        // for (String id : ids) {
        //     System.out.println(id);
        // }

        // // Basic HashSet information
        // System.out.println("Set size: " + ids.size());
        // System.out.println("Contains DOC-002: " + ids.contains("DOC-002"));




    //testing for both list and hash
    // DocumentRegistry registry = new DocumentRegistry();
    // String typeStore = "hash";

    // System.out.println("\n===== Testing " + typeStore + " =====");

    // System.out.println("Initial contents:");
    // registry.listAllDocuments(typeStore);

    // Document doc1 = new Document("DOC-001", "Java Notes");
    // Document doc2 = new Document("DOC-001", "Python Notes"); // duplicate ID

    // System.out.println("Adding first document: "
    //         + registry.addDocument(doc1, typeStore));

    // System.out.println("After first add:");
    // registry.listAllDocuments(typeStore);

    // System.out.println("Adding duplicate document: "
    //         + registry.addDocument(doc2, typeStore));

    // System.out.println("After duplicate attempt:");
    // registry.listAllDocuments(typeStore);

    // System.out.println("Searching for DOC-001:");
    // Document found = registry.findById("DOC-001", typeStore);

    // if (found != null) {
    //     System.out.println("Found: " + found.getId() + ", " + found.getTitle());
    // } else {
    //     System.out.println("Document not found");
    // }

    // System.out.println("Searching for DOC-999:");
    // Document missing = registry.findById("DOC-999", typeStore);

    // if (missing != null) {
    //     System.out.println("Found: " + missing.getId() + ", " + missing.getTitle());
    // } else {
    //     System.out.println("Document not found");
    // }

    // System.out.println("Adding null: " + registry.addDocument(null, typeStore));


    ///this is for the record testing
    
    DocumentRecord doc = new DocumentRecord("DOC-001", "Java Notes");

    System.out.println(doc.id());
    System.out.println(doc.title());
    System.out.println(doc);






        


    }
}


