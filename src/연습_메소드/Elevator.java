package 연습_메소드;

public class Elevator {
    public static void main(String[] args) {
        //변수 생성
        int a = 13;
        int b = 7;
        int c = 10;

        // 결과 출력
        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));

    }

    private static String guide(int DD) {
        if (DD >= 11 && DD <= 20) {
            return "고층";
        }
        else 
            return "저층";
    }

}
