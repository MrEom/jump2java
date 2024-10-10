package 연습_상속인터페이스;

// 나와야 하는 결과값 (현재 미완)
/* 운행을 시작합니다
   운행을 종료합니다. 요금은 8000원 입니다.*/



public class MeterExam {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.stop(2500);
    }
}

interface Meter{
    public int BASE_FARE = 3000;
    public abstract void start();
    public abstract void stop(int distance);
}

class Taxi implements Meter{
    @Override
    public void start() {
        System.out.printf("운행을 시작합니다.\n");

    }

    @Override
    public void stop(int distance) {
        System.out.printf("운행을 종료합니다. 요금은 %s원 입니다.",distance*2 +BASE_FARE);
    }
}
