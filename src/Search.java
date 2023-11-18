public class Search extends Library
{
    public static int authorName(String name)
    {
        for(int i = 0 ; i < authors.size() ; i++)
        {
            if(authors.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }

    public static int memberName(String name)
    {
        for (int i = 0 ; i < members.size() ; i++)
        {
            if(members.get(i).getName().equals(name));
            {
                return i;
            }
        }
        return -1;
    }

    public static int bookTitle(String name)
    {
        for (int i = 0 ; i < books.size() ; i++)
        {
            if(books.get(i).getTitle().equals(name));
            {
                return i;
            }
        }
        return -1;
    }

    public static void keyword(String keyword)
    {
        for (Book book : books)
        {
            if(book.getTitle().contains(keyword));
            {
                System.out.println(book.toString());
            }
        }
    }
}
