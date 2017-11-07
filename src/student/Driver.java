package student;

import java.io.*;
import java.util.Scanner;


public class Driver implements Serializable {

        public static void readFile() {
        try {
            FileInputStream f = new FileInputStream("Student.ser");
            ObjectInputStream o = new ObjectInputStream(f);
            StudentDiary st = (StudentDiary)o.readObject();
            st.displaydetails();
        }

        catch(FileNotFoundException fof) {
            System.out.println("File not found!");
        }

        catch(IOException ioe) {
            System.out.println("File may be corrupt!");
        }

        catch(ClassNotFoundException cnf) {
            System.out.println("Class not found!");
        }

    }
    public static void writeFile(StudentDiary sd) {
        try {
            FileOutputStream f = new FileOutputStream("Student.ser");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(sd);
        }

        catch(FileNotFoundException fof) {
            System.out.println("File not found!");
        }

        catch(IOException ioe) {
            System.out.println("File may be corrupt!");
        }
    }

    public static void main(String args[]) {
        StudentDiary sd = new StudentDiary();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("Enter 1 to add details");
            System.out.println("Enter 2 to print details");
            System.out.println("Enter 3 to exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    sd.addnewStudent();
                    writeFile(sd);
                    break;
                }
                case 2: {
                    readFile();
                    break;
                }

                case 3:{
                    break;
                }
            }
        }
    }
}
