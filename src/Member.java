import java.util.ArrayList;

public class Member extends Person
{
    private ArrayList<Book> booksRead;

    public Member(String name, int day, int month, int year, int age)
    {
        super(name, day, month, year, age);
        this.booksRead = new ArrayList<>();
    }

    public void getBook(Book book)
    {
        this.booksRead.add(book);
    }

    public String booksRead()
    {
        StringBuilder sb = new StringBuilder();
        for (Book book : booksRead)
        {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }

    public String toString()
    {
        return "Name: " + getName() + ", Birthday: " + getBirthday() + ", Age: " + getAge() + ", Books read: " + booksRead();
    }
}
