package za.ac.cput;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/03/10.
 */
public class MapStudents {
    public static Map studentDetails(Map student)throws Exception
    {
        student = new HashMap();
        student.put("Jayson", 25);
        student.put("Adam", 23);
        student.put("Wheeler", 26);
        student.put("Victor", 21);

        return student;
    }
}
