import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;


public class Library
{
    public static ArrayList<Author> authors;
    public static ArrayList<Book> books;
    public static ArrayList<Member> members;
    private String name;
    private int day, month, year;

    public Library()
    {
        authors = new ArrayList<>();
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addAuthor()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the author:");
        String name = scanner.nextLine();
        System.out.println("Enter the birthday of the author:");
        System.out.println("Day:");
        int day = scanner.nextInt();
        System.out.println("Month:");
        int month = scanner.nextInt();
        System.out.println("Year:");
        int year = scanner.nextInt();
        System.out.println("Enter the age of the author:");
        int age = scanner.nextInt();
        Author author = new Author(name, day, month, year, age);
        authors.add(author);

    }
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the author of the book:");
        String authorName = scanner.nextLine();
        System.out.println("Enter the title of the book:");
        String title = scanner.nextLine();
        System.out.println("Enter the number of pages in the book:");
        int pages = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the ISBN of the book:");
        String isbn = scanner.nextLine();

        // Find the author in the list
        Author author = null;
        for (Author a : authors) {
            if (a.getName().equals(authorName)) {
                author = a;
                break;
            }
        }

        if (author != null) {
            Book book = new Book(author, title, pages, isbn);
            books.add(book);
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Author not found. Would you like to add a new author? (y/n)");
            String choice = scanner.nextLine();
            if (choice.equals("y")) {
                addAuthor();
                Book book = new Book(authors.get(authors.size() - 1), title, pages, isbn);
                books.add(book);
                System.out.println("Book added successfully.");
            }
        }
    }

    public void addMember()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the member:");
        String name = scanner.nextLine();
        System.out.println("Enter the birthday of the member:");
        System.out.println("Day:");
        int day = scanner.nextInt();
        System.out.println("Month:");
        int month = scanner.nextInt();
        System.out.println("Year:");
        int year = scanner.nextInt();
        System.out.println("Enter the age of the member:");
        int age = scanner.nextInt();
        Member member = new Member(name, day, month, year, age);
        members.add(member);
    }

    public void listOfAuthors()
    {
        for(Author author : authors)
        {
            if (!author.getBooks().isEmpty())
                System.out.println(author.toString() + "\n" + author.printBook());
            else
                System.out.println(author.toString() + "\nNo books found");
        }
    }
    public void listOfBooks()
    {
        for(Book book : books)
        {
            System.out.println(book.toString());
        }
    }
    public void listOfMembers()
    {
        for(Member member : members)
        {
            System.out.println(member.toString());
        }
    }

    public void displayBooksOfAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the author whose books you want to display:");
        String name = scanner.nextLine();

        // Find the author in the list
        for (Author author : authors) {
            if (author.getName().equals(name)) {
                System.out.println(author.printBook());
                return;
            }
        }
        System.out.println("Author not found.");
    }


    public void displayBooksOfMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the member whose books you want to display:");
        String name = scanner.nextLine();

        // Find the member in the list
        for (Member member : members) {
            if (member.getName().equals(name)) {
                System.out.println(member.booksRead());
                return;
            }
        }
        System.out.println("Member not found.");
    }

    public void modifyAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the author you want to modify:");
        String name = scanner.nextLine();

        // Find the author in the list
        for (Author author : authors) {
            if (author.getName().equals(name)) {
                System.out.println("What would you like to modify?");
                System.out.println("1. Name");
                System.out.println("2. Birthday");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("Enter the new name:");
                        String newName = scanner.nextLine();
                        author.setName(newName);
                        break;
                    case "2":
                        System.out.println("Enter the new day:");
                        int newDay = scanner.nextInt();
                        System.out.println("Enter the new month:");
                        int newMonth = scanner.nextInt();
                        System.out.println("Enter the new year:");
                        int newYear = scanner.nextInt();
                        author.setDay(newDay);
                        author.setMonth(newMonth);
                        author.setYear(newYear);
                        author.setAge(Period.between(LocalDate.of(newYear, newMonth, newDay), LocalDate.now()).getYears());
                        System.out.println("Author modified successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
                return;
            }
        }
        System.out.println("Author not found.");
    }


    public void modifyMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the member you want to modify:");
        String name = scanner.nextLine();

        // Find the member in the list
        for (Member member : members) {
            if (member.getName().equals(name)) {
                System.out.println("What would you like to modify?");
                System.out.println("1. Name");
                System.out.println("2. Birthday");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("Enter the new name:");
                        String newName = scanner.nextLine();
                        member.setName(newName);
                        break;
                    case "2":
                        System.out.println("Enter the new day:");
                        int newDay = scanner.nextInt();
                        System.out.println("Enter the new month:");
                        int newMonth = scanner.nextInt();
                        System.out.println("Enter the new year:");
                        int newYear = scanner.nextInt();
                        member.setDay(newDay);
                        member.setMonth(newMonth);
                        member.setYear(newYear);
                        member.setAge(Period.between(LocalDate.of(newYear, newMonth, newDay), LocalDate.now()).getYears());
                        System.out.println("Member modified successfully.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
                return;
            }
        }
        System.out.println("Member not found.");
    }

    public void getBookSuggestion()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter author name:");
        String authorName = scan.nextLine();
        for (Author author : authors)
        {
            if(author.getName().equals(authorName))
            {
                Book suggestedBook = author.bookSuggestion();
                if(suggestedBook != null)
                {
                    System.out.println("Here is a book suggestion: " + suggestedBook.getTitle());
                    return;
                }
                return;
            }
            System.out.println("Author not found.");

        }
       System.out.println("Author not found.");
    }

    public void lendBook()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter member name you want to lend to:");
        String memberName = scan.nextLine();
        for (Member member : members)
        {
            if(member.getName().equals(memberName))
            {
                System.out.println("Enter book title:");
                String bookTitle = scan.nextLine();
                for (Book book : books)
                {
                    if(book.getTitle().equals(bookTitle))
                    {
                        member.getBook(book);
                        System.out.println("Book lent.");
                        return;
                    }
                }
                System.out.println("Book not found.");
                return;
            }
        }
        System.out.println("Member not found.");
    }

    public void searchBooks()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter keyword:");
        String keyword = scan.nextLine();
        for (Book book : books)
        {
            if(book.getTitle().contains(keyword))
            {
                System.out.println(book);
            }
            else
            {
                System.out.println("Book not found.");
            }
        }
    }
}
