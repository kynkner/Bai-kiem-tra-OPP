package entity;

import statics.TypeItem;

import java.util.Scanner;

public class Items implements InputInfo{
    public static  int auto_id = 1000;
    private int Id;
    private String Name;
    private TypeItem typeItem;
    private int Price;
    private int quantitys;

    public Items() {
        Id = auto_id;
        auto_id++;
    }

    @Override
    public String toString() {
        return "Items{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", typeItem=" + typeItem.value +
                ", Price=" + Price +
                ", quantitys=" + quantitys +
                '}';
    }

    public static int getAuto_id() {
        return auto_id;
    }

    public static void setAuto_id(int auto_id) {
        Items.auto_id = auto_id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public TypeItem getTypeItem() {
        return typeItem;
    }

    public void setTypeItem(TypeItem typeItem) {
        this.typeItem = typeItem;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getQuantitys() {
        return quantitys;
    }

    public void setQuantitys(int quantitys) {
        this.quantitys = quantitys;
    }
    @Override
    public void inputInfo() {
        System.out.print("Nhập tên mặt hàng: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Chọn 1 trong các nhòm hàng sau: ");
        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");
        int choofunstion = inputChofunstion();
        switch (choofunstion){
            case 1:
                this.typeItem = TypeItem.Electronic;
                break;
            case 2:
                this.typeItem = TypeItem.Refrigeration;
                break;
            case 3:
                this.typeItem = TypeItem.Computer;
                break;
            case 4:
                this.typeItem = TypeItem.Officeequipment;
                break;
        }
        System.out.print("Nhập giá bán: ");
        this.setPrice(new Scanner(System.in).nextInt());
        System.out.print("Nhập số lương: ");
        this.setQuantitys(new Scanner(System.in).nextInt());
    }

    private int inputChofunstion() {
        int chofunstion;
        do {
            chofunstion = new Scanner(System.in).nextInt();
            if (chofunstion > 0 && chofunstion < 5){
                break;
            }
            System.out.println("Không có loại mặt hàng, vui lòng nhập từ 1 đến 4: ");
        }while (true);
        return chofunstion;
    }

    public void printItem() {
        System.out.print(" Mã mặt hàng: "+Id);
        System.out.print(", Tên mặt hàng: "+Name);
        System.out.print(", Nhóm hàng: "+typeItem.value);
        System.out.print(", Giá bán: "+Price);
        System.out.print(", Số lượng: "+quantitys);
    }
}
