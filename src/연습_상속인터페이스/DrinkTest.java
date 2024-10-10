package 연습_상속인터페이스;

class ordered{
    public void ordered() {
        System.out.println
                ("%d 주문되었습니다.");
    }
}

class Juice extends ordered{
    String name;
    double price;
}

class Coffee extends ordered{
    String name;
    double price;
}

class Beer extends ordered{
    String name;
    double price;
}

class Water extends ordered{
    String name;
    double price;
}

class Tea extends ordered{
    String name;
    double price;
}

public class DrinkTest {
    public static void main(String[] args) {
        Juice j = new Juice();
        Coffee c = new Coffee();
        Beer b = new Beer();
        Water w = new Water();
        Tea t = new Tea();

        ordered[] drinks = {j, c, b, w, t};

        for (ordered d : drinks) {
            d.ordered();
        }

    }
}
