package student;

import java.io.Serializable;
import java.util.ArrayList;

public class Academics implements Serializable {
    ArrayList<Semester> sem;

    Academics()
    {
        sem = new ArrayList<Semester>();
    }

    public void addSemester()
    {
        Semester s = new Semester();
        s.addCourse();
        sem.add(s);
    }

}
