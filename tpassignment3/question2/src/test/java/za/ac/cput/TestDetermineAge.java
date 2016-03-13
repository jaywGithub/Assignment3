package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/12.
 */
public class TestDetermineAge{
    @Test
    public void testAge()throws Exception
    {
        DetermineAgeInterface deterAge = new DetermineAge();
        int result = deterAge.calcAge(2016, 1980);

        Assert.assertEquals(36, result);
    }
}
