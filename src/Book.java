import java.util.ArrayList;
import java.util.Random;

public class Book
{
    private Author author;
    private String title;
    private int numberOfPages;
    private String ISBN;

    public Book(Author author, String title, int numberOfPages, String ISBN)
    {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.ISBN = ISBN;
        this.author.addBook(this);
    }

    public void updateTitle(String newTitle)
    {
        this.title = newTitle;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String toString()
    {
        return "Title: " + title + ", Author: " + author.getName() + ", Number of pages: " + numberOfPages + ", ISBN: " + ISBN;
    }

    public Book bookLikeThis()
    {
        Random rand = new Random();
        return author.getBooks().get(rand.nextInt(author.getBooks().size()));
    }
}
