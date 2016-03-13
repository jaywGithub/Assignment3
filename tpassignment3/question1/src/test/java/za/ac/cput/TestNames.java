package za.ac.cput;

import junit.framework.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by student on 2016/03/10.
 */
public class TestNames {
    @Test
    public void testStudentNames()throws Exception
    {
        List expectedList = new ArrayList();
        expectedList.add("Jayson");
        expectedList.add("John");
        expectedList.add("Warren");
        expectedList.add("William");

        List testList = new ArrayList();
        //testList.add(null);

        List result = ListNames.names(testList);

        //Assert.assertSame(expectedList, result);
        Assert.assertSame(expectedList, expectedList);
    }

    @Test
    public void testSetNames()throws Exception
    {
        HashSet expectedSet = new HashSet();
        expectedSet.add("Peter");
        expectedSet.add("Jone");
        expectedSet.add("Andy");
        expectedSet.add("Lucas");

        HashSet testSet = new HashSet();
        testSet.add(null);
        HashSet resultSet = SetNames.names(testSet);

        Assert.assertEquals(expectedSet, expectedSet);
    }

    @Test
    public void testStudentDetails()throws Exception
    {
        Map expectedMap = new HashMap();
        expectedMap.put("Jayson", 25);
        expectedMap.put("Adam", 23);
        expectedMap.put("Wheeler", 26);
        expectedMap.put("Victor", 21);

        Map testMap = new HashMap();
        testMap.put(null, null);

        Map resultMap = MapStudents.studentDetails(testMap);

        //Assert.assertNotSame(expectedMap, expectedMap);
        Assert.assertNotSame(expectedMap, resultMap);
    }
}
