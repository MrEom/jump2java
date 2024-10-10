package 연습_클래스;

public class ItemTest {
    public static void main(String[] args) {
        // 아이템 객체 생성
        Item storm = new Item("스톰 브레이커", 600);
        Item gauntlet = new Item("인피니티 건틀렛", 999);
        Item bow = new Item("호크아이의 활", 50);
        Item shield = new Item("캡틴아메리카의 방패", 50);

        //객체 배열에 아이템 할당
        Item[] items = {storm, gauntlet, bow, shield};

        //모든 아이템 정보를 출력하기

        System.out.println(storm.toString());
        System.out.println(gauntlet.toString());
        System.out.println(bow.toString());
        System.out.println(shield.toString());
    }
}

class Item {
    String name;
    int power;

    public Item(String str, int i) {
        this.name = str;
        this.power = i;
    }

    public String toString() {
        return String.format("Item { name : %s, power: %d}", name, power);
    }
}
