package za.ac.cput;

import java.io.Serializable;

/**
 * Created by JAYSON on 2016-03-13.
 */
public class DetermineAgeData implements Serializable {
    private int currentYear;
    private int birthYear;
    private int age;

    public int getCurrentYear()
    {
        return currentYear;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public int getAge()
    {
        return getCurrentYear() - getBirthYear();
    }

    public void setCurrentYear(int currentYear)
    {
        this.currentYear = currentYear;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }
}
