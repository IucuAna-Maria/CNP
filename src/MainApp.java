import java.util.Scanner;
import java.util.Vector;

public class MainApp
{
    public static int verifyLastDigit(String cnp)
    {
        int[] vector = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
        int digit = 0;
        for (int i =0; i < 12; i++)
            digit = digit + vector[i] * Character.getNumericValue(cnp.charAt(i));
        if (digit % 11 == 10)
            return 1;
        else
            return digit % 11;
    }

    public static int verifyCNP(String cnp)
    {
        int digits = 0;
        if (cnp.length() == 13)
        {
            for (int i = 0; i < 13; i++)
                if (Character.isDigit(cnp.charAt(i)))
                    digits++;
            if (digits == 13)
                if (cnp.charAt(0) == '1' || cnp.charAt(0) == '2' || cnp.charAt(0) == '5' || cnp.charAt(0) == '6')
                    if (Character.getNumericValue(cnp.charAt(12)) == verifyLastDigit(cnp))
                        return 1;
        }
        System.out.println("Invalid CNP!");
        System.out.println("CNP: ");
        return 0;
    }

    public static void main(String[] args)
    {
        int numberOfPersons;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people would you like to add? ");
        numberOfPersons = scan.nextInt();
        scan.nextLine();
        Vector<Person> people = new Vector<Person>(numberOfPersons);

        String name, cnp;

        for (int i = 0; i < numberOfPersons; i++)
        {
            System.out.print("Name: ");
            name = scan.nextLine();
            System.out.print("CNP: ");
            while (verifyCNP(cnp = scan.nextLine()) == 0);
            people.add(new Person(name, cnp));
        }

        /* Display people (name, cnp, age) */
        for (Person p: people)
            System.out.println("Name: " + p.getName() + ", CNP: " + p.getCnp() + ", Age: " + p.getAge());
    }
}