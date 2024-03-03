import java.time.LocalDate;
import java.time.Period;

public class Person
{
    private String name, cnp;

    Person(String name, String cnp)
    {
        this.name = name;
        this.cnp = cnp;
    }

    public String getName()
    {
        return name;
    }

    public String getCnp()
    {
        return cnp;
    }

    public int getAge()
    {
        String year, month, day, date;

        /* Here we will get the first two digits of the year the person was born */
        if(cnp.charAt(0) == '1' || cnp.charAt(0) == '2')
            year = "19";
        else
            year = "20";
        /* Now we will get the year */
        year = year + cnp.charAt(1) + cnp.charAt(2);

        /* Here we will get the month */
        month = "" + cnp.charAt(3) + cnp.charAt(4);

        /* Here we will get the day */
        day = "" + cnp.charAt(5) + cnp.charAt(6);

        /* This is the date the person was born */
        date = year + "-" + month + "-" + day;

        LocalDate dateOfBirth = LocalDate.parse(date);
        LocalDate nowDate = LocalDate.now();

        /* Now we will return the age of the person */
        return Period.between(dateOfBirth, nowDate).getYears();
    }
}