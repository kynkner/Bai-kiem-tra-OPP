package logic;

import entity.Items;
import entity.SalesList;
import entity.SaleslistDetaisl;
import entity.Staff;

import java.util.Arrays;
import java.util.Scanner;

public class SalesListLogic {
    private ItemLogic itemLogic;
    private StaffLogic staffLogic;
    private SalesList[] salesLists = new SalesList[100];

    public SalesListLogic(ItemLogic itemLogic, StaffLogic staffLogic) {
        this.itemLogic = itemLogic;
        this.staffLogic = staffLogic;
    }

    public void inputSales() {
        System.out.println("Nhập số lượng nhân viên bán hàng: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập mã nhân viên: ");
            Staff staff = chackStaff();
            System.out.println("Nhập số lượng mặt hàng nhân viên đã tham gia : ");
            int numberSell = checkNumberSell();
            SaleslistDetaisl[] detaisls = inputDetaisls(numberSell);
            SalesList salesList = new SalesList(staff, detaisls);
            saveSalesList(salesList);
        }
    }

    private void saveSalesList(SalesList salesList) {
        for (int i = 0; i < salesLists.length; i++) {
            if(salesLists[i] == null){
                salesLists[i] = salesList;
                return;
            }
        }
    }

    private SaleslistDetaisl[] inputDetaisls(int numberSell) {
        SaleslistDetaisl[] detaisls = new SaleslistDetaisl[numberSell];
        int count = 0;
        for (int j = 0; j < numberSell; j++) {
            System.out.println("Nhập mã mặt hàng");
            Items items = checkItems();
            System.out.println("Nhập số lượng mặt hàng đã bán: ");
            int quantity = checkquantity();
            detaisls[count] = new SaleslistDetaisl(items, quantity);
            count++;
        }
        return detaisls;
    }

    private int checkquantity() {
        int quantity;
        do {
            quantity = new Scanner(System.in).nextInt();
            if (quantity > 0){
                break;
            }
            System.out.println("So luong lon hon 0");
        }while (true);
        return quantity;
    }

    private Items checkItems() {
        int number;
        Items items;
        do {
            number = new Scanner(System.in).nextInt();
            items = itemLogic.seachItems(number);
            if(items != null){
                break;
            }
            System.out.println("Không tồn tại mặt hàng có mã "+number+", Xin vui long nhập lại: ");
        }while (true);
        return items;

    }

    private int checkNumberSell() {
        int numberSell;
        do {
            numberSell = new Scanner(System.in).nextInt();
            if(numberSell > 0 && numberSell < 6){
                break;
            }
            System.out.println("Số lượng tối đa tham gia là 5, Vui lòng nhập lại: ");
        }while (true);
        return numberSell;
    }

    private Staff chackStaff() {
        int number;
        Staff staff;
        do {
            number = new Scanner(System.in).nextInt();
            staff = staffLogic.seachStaff(number);
            if(staff != null){
                break;
            }
            System.out.println("Không tồn tại nhân viên có mã "+number+", Xin vui long nhập lại: ");
        }while (true);
        return staff;
    }

    public void showSales() {
        for (int i = 0; i < salesLists.length; i++) {
            if(salesLists[i] != null){
                System.out.println(salesLists[i]);
            }
        }
    }

    public void ArrangeName() {
        for (int i = 0; i < salesLists.length - 1; i++) {
            if(salesLists[i] == null){
                continue;
            }
            for (int j = i + 1; j < salesLists.length; j++) {
                if(salesLists[j] == null){
                    continue;
                }
                if(salesLists[i].getStaff().getName().trim().compareToIgnoreCase(salesLists[j].getStaff().getName().trim()) > 0){
                    SalesList temp = salesLists[i];
                    salesLists[i] = salesLists[j];
                    salesLists[j] = temp;
                }
            }
        }
        showSales();
    }
}
