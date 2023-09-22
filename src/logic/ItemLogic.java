package logic;

import entity.Items;

import java.util.Scanner;

public class ItemLogic {
    Items[] itemss = new Items[100];


    public void inputItems() {
        System.out.print("Có bao nhiêu mặt hàng mới: ");
        int numberItems = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberItems; i++) {
            System.out.println("------------------------------");
            System.out.println("Nhập mặt hàng "+(i + 1)+" :");
            Items items = new Items();
            items.inputInfo();
            saveItems(items);
        }
    }

    private void saveItems(Items items) {
        for (int i = 0; i < itemss.length; i++) {
            if(itemss[i] == null){
                itemss[i] = items;
                return;
            }
        }
    }


    public void showItems() {
        for (int i = 0; i < itemss.length; i++) {
            if (itemss[i] != null){
                System.out.print("Mặt hàng thứ "+(i + 1)+" :");
                itemss[i].printItem();
                System.out.println();
            }
        }
    }

    public Items seachItems(int number) {
        for (int i = 0; i < itemss.length; i++) {
            if(itemss[i] != null && itemss[i].getId() == number){
                return itemss[i];
            }
        }
        return null;
    }

}
