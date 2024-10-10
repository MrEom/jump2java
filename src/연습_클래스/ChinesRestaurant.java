package 연습_클래스;

import java.awt.*;

public class ChinesRestaurant {
    public static void main(String[] args) {
        //주문을 위한 메뉴 선정
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕", 5900);
        Menu tangsook = new Menu("탕수육", 13900);

        Menu[] menuArr = { jjajang, jjambbong, tangsook };
        Order order = new Order(123, menuArr);

    System.out.printf("주문 합계: %d원\n", order.totalPrice());

    }
}

class Order {
    int orderNum;
    Menu[] menus;

    public Order(int i, Menu[] arr) {
        orderNum = i;
        menus = arr;
    }

    public int totalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < menus.length; i++) {
            Menu menu = menus[i];
            totalPrice += menu.price;

        }
        return totalPrice;
    }
}

class Menu{
    String name;
    int price;

    public Menu(String str, int i) {
        name = str;
        price = i;
    }
}
