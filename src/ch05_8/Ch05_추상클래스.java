package ch05_8;

//추상클래스 abstract 키워드를 클래스 앞에 적음
abstract class Animal {
    //필드변수
    int a = 0;
    String k = "동물";

    //추상메소드
    public abstract void color();
    protected abstract void height();

    //일반메소드
    public void printName(String name) {
        System.out.println(name);
    }
}

class Cat extends Animal {

    @Override
    public void color() {
        //부모(Super Class) Animal에서 받은 변수 a
        System.out.print("고양이 색\n");
    }

    @Override
    protected void height() {
        System.out.print("고양이 키\n");

    }
    //일반 메소드인 printName은 무조건 구현하지 않아도 됨
}



public class Ch05_추상클래스 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color();
        cat.height();
        cat.printName("고양이");


    }
}
