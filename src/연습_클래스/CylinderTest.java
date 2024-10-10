package 연습_클래스;

public class CylinderTest {
    public static void main(String[] args) {
        //객체 생성
        Cylinder c = new Cylinder();

        // 속성 값 입력
        c.r = 4;
        c.h = 5;

        //출력
        System.out.printf("원기둥의 부피: %.2f\n", c.getvlass());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());

    }
}

class Cylinder{
    double r;
    double h;


    public Cylinder() {
        this.r = r;
        this.h = h;

    }

    public Object getvlass() {
        return Math.PI * r * r * h ;

    }

    public Object getArea() {
        return Math.PI * r * r * 2 + Math.PI * 2 * r * h;
    }


}

