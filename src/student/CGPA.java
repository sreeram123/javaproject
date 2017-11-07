package student;

import java.io.Serializable;
import java.util.ArrayList;

public class CGPA implements Serializable {
    float cgpa;

    CGPA()
    {
        cgpa=0;
    }

    public void setGPA(ArrayList<SGPA> s)
    {
        for(SGPA i:s)
        {
            cgpa += i.getSgpa();
        }
        cgpa=cgpa/s.size();
    }

    public float getGpa()
    {
        return cgpa;
    }

    public String toString()
    {
        return "cumulative GPA:"+cgpa;
    }

    public void print()
    {
        System.out.println(toString());
    }


}
