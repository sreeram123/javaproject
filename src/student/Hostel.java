package student;

import java.io.Serializable;
import java.util.Scanner;

public class Hostel implements Serializable {
    String hostelName;
    int roomNo;
    public void addRecords(){
        Scanner s = new Scanner(System.in);
        System.out.println("Which hostel do you belong to?");
        hostelName = s.next();
        System.out.println("Which room are you in?");
        roomNo = s.nextInt();
    }
    public void setHostel(String h){
        hostelName = h;
    }
    public void setRoomNo(int r){
        roomNo = r;
    }
    public String toString(){
        return "Hostel Name: " + hostelName + "\nRoom no: " + roomNo + "\n";
    }
    public void print(){
        System.out.println(this.toString());
    }
}

