package 연습_클래스;

public class FoodTest {
    public static void main(String[] args) {
        // 음식 객체 생성
        Food chicken = new Food("치킨", 18000);
        Food pizza = new Food("피자", 28000);
        Food sushi = new Food("초밥세트", 22000);

        //객체 배열에 음식 담기
        Food[] foods = {chicken, pizza, sushi};

        //모든 음식 정보 출력
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i].toString());
        }
    }
}

class Food {
    //필드
    String name;
    int price;



    //생성자
    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // toString() 메소드 추가
        @Override
        public String toString() {
            return "Food{" +
                    "name='" + name + '\'' +
                    ", price :" + price + '원' + '}';

    }
}
