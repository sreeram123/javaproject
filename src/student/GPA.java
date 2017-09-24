package student;

public class GPA {
    float gpa;

    public GPA()
    {
        gpa = 0;
    }

    public void calculateGPA(Internals i, EndSem s)
    {
        gpa = (i.getMark()+s.getMark())/10;
    }

    public float getGPA()
    {
        return gpa;
    }

    public String toString()
    {
        return "GPA: "+gpa;
    }

    public void print()
    {
        System.out.println(toString());
    }

}
