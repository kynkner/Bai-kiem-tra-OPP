package logic;

import entity.Items;
import entity.Staff;

import java.util.Scanner;

public class StaffLogic {
    Staff[] staffs = new Staff[100];

    public Staff[] getStaffs() {
        return staffs;
    }

    public void inputStaff() {
        System.out.println("Có bao nhiêu nhân viên");
        int numberItems = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberItems; i++) {
            System.out.println("Nhập nhân viên " + (i + 1) + " :");
            Staff staff = new Staff();
            staff.inputInfo();
            saveStaff(staff);
        }
    }

    private void saveStaff(Staff staff) {
        for (int i = 0; i < staffs.length; i++) {
            if(staffs[i] == null){
                staffs[i] =staff;
                return;
            }
        }
    }

    public void showStaff() {
        for (int i = 0; i < staffs.length; i++) {
            if(staffs[i] != null){
                System.out.println("Nhân viên "+(i + 1)+" :");
                staffs[i].printStaff();
                System.out.println();
            }
        }
    }

    public Staff seachStaff(int number) {
        for (int i = 0; i < staffs.length; i++) {
            if(staffs[i] != null && staffs[i].getId() == number){
                return staffs[i];
            }
        }
        return null;
    }
}
