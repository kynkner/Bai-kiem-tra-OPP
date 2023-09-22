package logic;

import entity.SalesList;

import java.util.Scanner;

public class MenuLogic {
    private StaffLogic staffLogic = new StaffLogic();
    private ItemLogic itemLogic = new ItemLogic();
    private SalesListLogic salesListLogic = new SalesListLogic(itemLogic, staffLogic);


    public void run() {
        while (true) {
            showMenu();
            int choofunstion = inputChofunstion();
            switch (choofunstion){
                case 1:
                    itemLogic.inputItems();
                    break;
                case 2:
                    itemLogic.showItems();
                    break;
                case 3:
                    staffLogic.inputStaff();
                    break;
                case 4:
                    staffLogic.showStaff();
                    break;
                case 5:
                    salesListLogic.inputSales();
                    break;
                case 6:
                    salesListLogic.showSales();
                    break;
                case 7:
                    showArrange();
                    break;
                case 8:
                    break;
                case 9:
                    return;

            }
        }
    }

    private void showArrange() {
        System.out.println("-----Bảng sắp xếp danh sách bán hàng-----");
        System.out.println("1. Sắp xếp theo tên");
        System.out.println("2. Sắp xếp theo nhóm mặt hàng");
        int number;
        do {
            number = new Scanner(System.in).nextInt();
            if(number == 1 || number == 2){
                break;
            }
            System.out.println("Khong co chuc nang, vui long chon 1 hoac 2: ");
        }while (true);
        if(number == 1){
            salesListLogic.ArrangeName();
        }
    }

    private int inputChofunstion() {
        System.out.print("Xin mời chọn chức năng: ");
        int choofunstion;
        do {
            choofunstion = new Scanner(System.in).nextInt();
            if(choofunstion > 0 && choofunstion < 10){
                break;
            }
            System.out.println("Không có chức năng để chọn, Vui lòng chọn chức năng từ 1 đến 9: ");
        }while (true);
        return choofunstion;

    }

    private void showMenu() {
        System.out.println("------Quản lý nhân viên bán hàng-------");
        System.out.println("1. Nhập mặt hàng mới");
        System.out.println("2. In danh sách mặt hàng");
        System.out.println("3. Nhập nhân viên mới");
        System.out.println("4. In danh sách nhân viên mới");
        System.out.println("5. Bảng danh sách bán hàng cho từng nhân viên");
        System.out.println("6. In danh sách bán hàng");
        System.out.println("7. Sắp xếp danh sách bán hàng");
        System.out.println("8. Bảng kê doanh thu cho mỗi nhân viên");
        System.out.println("9. Thoát");
    }
}
