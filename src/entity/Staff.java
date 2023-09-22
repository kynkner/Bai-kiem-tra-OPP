package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Staff extends  Person{
    public static int auto_id = 1000;
    private int Id;
    private LocalDate ContractDate;

    public Staff() {
        Id = auto_id;
        auto_id++;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "Id=" + Id +
                ", ContractDate=" + ContractDate +
                ", Name='" + Name + '\'' +
                ", Adress='" + Adress + '\'' +
                ", phone=" + phone +
                '}';
    }

    public static int getAuto_id() {
        return auto_id;
    }

    public static void setAuto_id(int auto_id) {
        Staff.auto_id = auto_id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDate getContractDate() {
        return ContractDate;
    }

    public void setContractDate(String contractDate) {
        ContractDate = LocalDate.parse(contractDate);
    }
    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.print("Nhập ngày kí hợp đồng(vui long nhap yyyy-dd-MM): ");
        this.setContractDate(String.valueOf(LocalDate.parse(new Scanner(System.in).next())));
    }

    public void printStaff() {
        System.out.print(" Mã nhân viên: "+Id);
        System.out.print(", Họ và tên: "+Name);
        System.out.print(", Địa chỉ: "+Adress);
        System.out.print(", Số điện thoại: "+phone);
        System.out.print(", Ngày kí hợp đồng: "+ContractDate);
    }
}
