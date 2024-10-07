package ch05;

/**
 * 별도의 계산기 클래스
 */
class Calculator{
    int result = 0;
    /**
     * 정수를 입력해 더해준 결과값을 리턴
     * @param num n-입력정수
     * @return  result 결과
     * */

    //클래스 안의 함수를 메소드라 함
    int add(int num){
        result += num;
        return result;

    }
}

    class Animal{
        String name; //객체변수
        void setName(String name){
            this.name = name;
        }
    }

public class Ch05_객체지향 {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator(); // 첫번째 객체
        Calculator cal2 = new Calculator(); // 두번째 객체

        System.out.println(cal1.add(4)); // 7
        System.out.println(cal1.add(3)); // 3


        System.out.println(cal2.add(4)); // 4
        System.out.println(cal2.add(8)); // 12

        //클래스로 객체(object)를 만든다.
        //클래스로 만든 객체를 인스턴스(instance)라고 한다.
        // 같은 Animal로 만들었어도 서로 다른 객체임.
        Animal cat = new Animal();
        Animal dog = new Animal();
        Animal pig = new Animal();

        cat.setName("고양이");
        System.out.println(cat.name);
        dog.setName("강아지");
        System.out.println(dog.name);
        pig .setName("돼지");
        System.out.println(pig.name);

    }
}
