import java.util.ArrayList;
import java.util.Random;

public class Author extends Person
{
    private ArrayList<Book> books;

//Constructor
    public Author(String name, int day, int month, int year, int age)
    {
        super(name, day, month, year, age);
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book)
    {
        this.books.add(book);
    }

    public String printBook()
    {
        StringBuilder sb = new StringBuilder();
        for (Book book : books)
        {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }

    public Book bookSuggestion()
    {
        if (books.size() > 0)
        {
            Random rand = new Random();
            return books.get(rand.nextInt(books.size()));
        }
        else
        {
            System.out.println("No books found");
            return null;
        }
    }

    public int getBookIndex(Book book)
    {
        return books.indexOf(book);
    }

    public void replaceBook(int index, Book newBook)
    {
        if (index >= 0 && index < books.size())
        {
            books.set(index, newBook);
        }
    }

    public String toString()
    {
        return "Name: " + getName() + ", Birthday: " + getBirthday() + ", Age: " + getAge();
    }
}

