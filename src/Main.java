import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("\n Menu of Functions: ");
            System.out.println("1. Add Author");
            System.out.println("2. Add Book");
            System.out.println("3. Add Member");
            System.out.println("4. List of Authors in Library");
            System.out.println("5. List of Books in Library");
            System.out.println("6. List of Members in Library");
            System.out.println("7. Get Book Suggestion");
            System.out.println("8. Lend Book to Member");
            System.out.println("9. Display all the books read by one member");
            System.out.println("10. Display all the books wrote by one author");
            System.out.println("11. Modify member details");
            System.out.println("12. Modify author details");
            System.out.println("13. Search books with a keyword");
            System.out.println("0. To Exit");

            System.out.println("\nYour choice:");
            input = scanner.nextInt();

            switch (input) {
                case 0:
                    // Exit
                    System.out.println("Exiting...");
                    break;
                case 1:
                    // Add Author
                    library.addAuthor();
                    break;
                case 2:
                    // Add Book
                    library.addBook();
                    break;
                case 3:
                    // Add Member
                    library.addMember();
                    break;
                case 4:
                    // List of Authors in Library
                    library.listOfAuthors();
                    break;
                case 5:
                    // List of Books in Library
                    library.listOfBooks();
                    break;
                case 6:
                    // List of Members in Library
                    library.listOfMembers();
                    break;
                case 7:
                    // Get Book Suggestion
                    library.getBookSuggestion();
                    break;
                case 8:
                    // Lend Book to Member
                    library.lendBook();
                    break;
                case 9:
                    // Display all the books read by one member
                    library.displayBooksOfMember();
                    break;
                case 10:
                    // Display all the books wrote by one author
                    library.displayBooksOfAuthor();
                    break;
                case 11:
                    // Modify member details
                    library.modifyMember();
                    break;
                case 12:
                    // Modify author details
                    library.modifyAuthor();
                    break;
                case 13:
                    // Search books with a keyword
                    library.searchBooks();
                    break;
            }
        }
            while (input != 0) ;
            scanner.close();

    }
}
