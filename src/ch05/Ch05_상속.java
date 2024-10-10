package ch05;

//부모 클래스
class Anima {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

//자식 클래스  Anima 클래스를 상속
class Dog extends Anima {
    // 생성자는 클래스명과 똑같고 리턴이 없음
    // 그중에 디폴트 생성자는 입력변수가 없음(생략가능)
    Dog(){
        System.out.println("도그객체 생성!");

    }
    void sleep(){
        System.out.println(this.name+"zzz");
    }
}

class HouseDog extends Dog {
    @Override
    void sleep(){
        System.out.println(this.name+"zzz in Home");
    }

    void sleep(int hour){
        System.out.println(this.name+"zzz in Home"+hour+"시간");

    }
}


public class Ch05_상속 {
    public static void main(String[] args) {
        Anima a = new Dog(); //상속관계일 때는 부모타입으로 선언가능
        Dog d = new Dog();
        d.setName("퍼피");
        System.out.println(d.name);
        d.sleep();



        //메서드 오버라이딩 : 부모메서드와 똑같은 이름의 메서드를 새로 만듬
        HouseDog h = new HouseDog();
        h.setName("해피");
        h.sleep();

        //메서드 오버로딩 : 이름은 같지만 입력변수가 틀리다
        h.sleep(10);
    }
}
