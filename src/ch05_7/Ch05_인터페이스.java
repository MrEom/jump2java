package ch05_7;

interface Predator{
    //추상메서드(구현이 되지 않은 메서드로 {몸통}이 없음)
    String gotFood(); // 예시) String(리턴타입) gotFood(이름) ()(입력변수)로 구성

}

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}


class Tiger extends Animal implements Predator{

    @Override
    public String gotFood() {
        return "사과";
    }
}

class Lion extends Animal implements Predator{
    public String gotFood() {
        return "바나나";
    }
}

class ZooKeeper{
    public void feed(Predator p){
        System.out.println("먹이주기 : " + p.gotFood());
    }
}


public class Ch05_인터페이스 {
     public static void main(String[] args) {
        Tiger  호랑이 = new Tiger();
        Lion 사자 = new Lion();
        ZooKeeper z = new ZooKeeper();

        z.feed(호랑이); //인터페이스 타입 객체 입력(구현한 클래스 객체)
        z.feed(사자);


    }
}
