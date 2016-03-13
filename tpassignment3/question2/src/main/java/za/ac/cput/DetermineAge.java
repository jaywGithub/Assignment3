package za.ac.cput;

/**
 * Created by student on 2016/03/12.
 */
public class DetermineAge implements DetermineAgeInterface {
    @Override
    public int calcAge(int currentYear, int birthYear) {

        return currentYear - birthYear;
    }
}
