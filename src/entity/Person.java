package entity;

import java.util.Scanner;

public class Person implements InputInfo{
    protected String Name;
    protected String Adress;
    protected int phone;

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Adress='" + Adress + '\'' +
                ", phone=" + phone +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    @Override
    public void inputInfo(){
        System.out.print("Nhập tên nhân viên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setAdress(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điện thoại: ");
        this.setPhone(new Scanner(System.in).nextInt());
    }
}
