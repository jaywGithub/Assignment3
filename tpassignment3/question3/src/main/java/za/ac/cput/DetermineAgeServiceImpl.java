package za.ac.cput;

/**
 * Created by JAYSON on 2016-03-13.
 */
public class DetermineAgeServiceImpl implements DetermineAgeService {
    public DetermineAgeData getAge()
    {
        DetermineAgeData ageData = new DetermineAgeData();

        ageData.setCurrentYear(2016);
        ageData.setBirthYear(1980);

        return ageData;
    }
}
