package student;

import java.util.ArrayList;

public class Academics {
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
