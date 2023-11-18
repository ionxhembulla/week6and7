public class Person
{
    private String name;
    private int day, month, year;
    private int age;
//MainConstructor
    public Person(String name, int day, int month, int year, int age) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.age = age;
    }
//noArg Constructor
    public Person() {
        this("Unknown", 1, 1, 2000, 0);
    }
//Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getBirthday()
    {
        return day + "/" + month + "/" + year;
    }

//Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setAge(int age) {
        this.age = age;
    }
}