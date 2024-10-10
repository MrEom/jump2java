package 연습_자바API;

public class KnightTest {
    public static void main(String[] args) {
        //객체 생성
        Knight knight = new Knight("돈키호테", 30);

        //정보출력
        System.out.print("[객체 생성]");
        System.out.printf("\t%s\n", knight.toString());

        //체력증가 + 30
        knight.setHp(knight.getHp() + 30);

        //결과 출력
        System.out.print("[체력 증가 +30]");
        System.out.printf("\t%s\n", knight.toString());
    }
}

class Knight {
    //필드는 privata 사용 (외부 접근금지)
    private String name;
    private int hp;

    //생성자
    public Knight(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    //겟메소드는 값을 가져옴 (리턴)
    public int getHp() {
        return hp;
    }

    //셋메소드는 값을 입력함
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}