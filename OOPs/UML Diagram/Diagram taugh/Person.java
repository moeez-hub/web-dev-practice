public class Person
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}

class Subject
{
    private String title;
    private int code;

    public String getTitle()
    {
        return title;
    }

    public int getCode()
    {
        return code;
    }
}

class Address
{
    private String city;
    private String country;

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }
}

class Student extends Person
{
    private int rollNo;
    Subject english;
    Address MuslimTown;

    public int getRollNo()
    {
        return rollNo;
    }

    public void study()
    {
        System.out.println(getName()+" is Studing");
    }
}

