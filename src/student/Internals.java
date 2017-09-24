package student;

public class Internals {
    float mark;

    public Internals()
    {
        mark=0;
    }

    public void calculate(FirstPeriodical fp, SecondPeriodical sp, ContinuousAssessment ca)
    {
        float f,s;
        f=(fp.getMark()/50)*15;
        s=(sp.getMark()/50)*15;
        mark=f+s+ca.getMark();
    }

    public float getMark()
    {
        return mark;
    }

    public String toString()
    {
        return "Internal Marks: "+ mark;
    }

    public void print()
    {
        System.out.println(toString());
    }


}
