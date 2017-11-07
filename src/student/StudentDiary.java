package student;

import java.io.Serializable;
import java.util.Scanner;

public class StudentDiary implements Serializable {
    Student st;
    Personal pers;
    ParentDetails pd;
    CourseDetails cd;
    Attendance att;
    Academics acc;
    Club c;
    Finance f;
    Hostel h;


    StudentDiary()
    {
        st = new Student();
        pers = new Personal();
        pd = new ParentDetails();
        cd = new CourseDetails();
        att = new Attendance();
    acc = new Academics();
        c = new Club();
        f = new Finance();
        h = new Hostel();
    }

    public void addnewStudent()
    {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        while(choice!=10) {
            System.out.println("Enter 1 to add Student details");
            System.out.println("Enter 2 to add personal details");
            System.out.println("Enter 3 to add parent details");
            System.out.println("Enter 4 to add course details");
            System.out.println("Enter 5 to add attendance");
            System.out.println("Enter 6 to add academic details");
            System.out.println("Enter 7 to add club details");
            System.out.println("Enter 8 to add financial details");
            System.out.println("Enter 9 to add hostel details");
            System.out.println("Enter 10 to exit");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:{
                    st.newStudent();
                    break;
                }

                case 2:{
                    pers.getPersonalData();
                    break;
                }

                case 3:{
                    pd.getParentDetails();
                    break;
                }

                case 4:{
                    cd.getCourseDetails();
                    break;
                }

                case 5:{
                    att.addAttendance();
                    break;
                }

                case 6:{
                    System.out.println("Which semester are you in?");
                    int semm=sc.nextInt();
                    System.out.println("How many courses do you have?");
                    int k = sc.nextInt();
                    for(int i=0;i<k;i++) {
                        acc.addSemester();
                    }
                    break;
                }

                case 7:{
                    c.addDetail();
                    break;
                }

                case 8:{
                    f.addFinance();
                    f.addDepartmentDue();
                    break;
                }

                case 9:{
                    h.addRecords();
                    break;
                }

                case 10:{
                    break;
                }
            }
        }
    }


    public void displaydetails()
    {
        st.printDetails();
        pers.displayData();
        pd.displayData();
        cd.displayData();
        att.print();
        c.print();
        f.printFinancials();
        h.print();
    }


}
