package za.ac.cput;

import java.util.HashSet;

/**
 * Created by student on 2016/03/10.
 */
public class SetNames {
    public static HashSet names(HashSet studentNames)throws Exception
    {
        studentNames = new HashSet();
        studentNames.add("Peter");
        studentNames.add("Jone");
        studentNames.add("Andy");
        studentNames.add("Lucas");

        return studentNames;
    }
}
