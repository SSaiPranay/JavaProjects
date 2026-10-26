
// public class Main {
//     public static void main(String[] args) {
        
//         // 1. Creates a book, for example "B-001", "Clean Code", "Robert Martin".
//         // Book myBook = new Book("B-001", "Clean Code", "Robert Martin");
//         // System.out.println("--- Book Created ---");

//         // // 2. Prints whether it is available.
//         // System.out.println("Is available? " + myBook.isAvailable()); // Expect: true

//         // // 3. Calls issue() and prints its return value.
//         // System.out.println("Calling issue(): " + myBook.issue()); // Expect: true

//         // // 4. Checks availability again.
//         // System.out.println("Is available now? " + myBook.isAvailable()); // Expect: false

//         // // 5. Calls issue() a second time and prints the result.
//         // System.out.println("Calling issue() again: " + myBook.issue()); // Expect: false

//         // // 6. Calls returnBook() and checks availability.
//         // System.out.println("Calling returnBook(): " + myBook.returnBook()); // Expect: true
//         // System.out.println("Is available now? " + myBook.isAvailable()); // Expect: true

//         // // 7. Calls returnBook() a second time and prints the result.
//         // System.out.println("Calling returnBook() again: " + myBook.returnBook()); // Expect: false


        
//         Library library = new Library();

//         System.out.println("===== TEST 1: Add books =====");
//         library.addBook("Clean Code", "Robert C. Martin");
//         library.addBook("Effective Java", "Joshua Bloch");
//         library.addBook("The Pragmatic Programmer", "Andrew Hunt");

//         System.out.println("\n===== TEST 2: List all books =====");
//         library.listAllBooks();

//         System.out.println("\n===== TEST 3: Check unique IDs =====");
//         // Inspect the listing above:
//         // Each book should have a different ID, e.g. B-001, B-002, B-003.

//         System.out.println("\n===== TEST 4: Check initial availability =====");
//         // Inspect the listing above:
//         // Every newly added book should show available = true.

//         System.out.println("\n===== TEST 5: Search by ID =====");
//         // Add this test after you implement searchById().
//         // Example:
//         // Book found = library.searchById("B-001");
//         // System.out.println(found != null ? found.getTitle() : "Book not found");

//         System.out.println("\n===== TEST 6: Issue a book =====");
//         // Add this after implementing issueBook(id).
//         // Example:
//         // System.out.println("Issue B-001: " + library.issueBook("B-001"));

//         System.out.println("\n===== TEST 7: Prevent duplicate issue =====");
//         // Example:
//         // System.out.println("Issue B-001 again: " + library.issueBook("B-001"));
//         // Expected: false (or your chosen failure message).

//         System.out.println("\n===== TEST 8: Return a book =====");
//         // Example:
//         // System.out.println("Return B-001: " + library.returnBook("B-001"));

//         System.out.println("\n===== TEST 9: Prevent duplicate return =====");
//         // Example:
//         // System.out.println("Return B-001 again: " + library.returnBook("B-001"));
//         // Expected: false (or your chosen failure message).

//         System.out.println("\n===== TEST 10: Invalid ID =====");
//         // Example:
//         // System.out.println("Issue invalid ID: " + library.issueBook("B-999"));
//         // Expected: false (or a clear error message).

//     }
// }
// import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("===== TEST 1: Add books =====");

        library.addBook("Clean Code", "Robert C. Martin");
        System.out.println("Added: Clean Code");

        library.addBook("Effective Java", "Joshua Bloch");
        System.out.println("Added: Effective Java");

        String id1 = library.addBook("The Pragmatic Programmer", "Andrew Hunt");
        System.out.println(id1);
        System.out.println("Added: The Pragmatic Programmer");

        System.out.println("\n===== TEST 2: Print all books =====");

        List<Book> books = library.listAllBooks();

        for (Book book : books) {
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Available: " + book.isAvailable());
            System.out.println("--------------------");
        }

        System.out.println("\n===== TEST 3: Total book count =====");
        System.out.println("Total books: " + books.size());
        Book found = library.searchById(id1);

        if (found != null) {
            System.out.println("Found: " + found.getTitle());

        } else {
            System.out.println("Book not found");
        }
        System.out.println("\n===== TEST 4: Issue a book =====");

        // Issue the book using its ID
        boolean issueResult = library.issueBook(id1);
        System.out.println("First issue successful: " + issueResult);

        // Check its availability after issuing
        Book issuedBook = library.searchById(id1);
        System.out.println("Available after issue: " + issuedBook.isAvailable());

        // Try issuing the same book again
        boolean secondIssueResult = library.issueBook(id1);
        System.out.println("Second issue successful: " + secondIssueResult);

        // Try issuing a book ID that does not exist
        boolean invalidIssueResult = library.issueBook("INVALID-ID");
        System.out.println("Issue invalid ID successful: " + invalidIssueResult);


        System.out.println("\n===== TEST 5: Return a book =====");

        // Return the book that was successfully issued in Test 4
        boolean returnResult = library.returnBook(id1);
        System.out.println("Return successful: " + returnResult);

        // Verify availability after returning
        Book returnedBook = library.searchById(id1);

        if (returnedBook != null) {
            System.out.println("Available after return: " + returnedBook.isAvailable());
        } else {
            System.out.println("Book not found after return");
        }

        // Try returning the same book again
        boolean secondReturnResult = library.returnBook(id1);
        System.out.println("Second return successful: " + secondReturnResult);

        // Try returning a book ID that doesn't exist
        boolean invalidReturnResult = library.returnBook("INVALID-ID");
        System.out.println("Return invalid ID successful: " + invalidReturnResult);
                                



    }
}


// TODO: Add a simple console menu in Main
// TODO: Remove temporary debug prints
// TODO: Commit the project to Git