package 연습_메소드;

public class RareItem {
    public static void main(String[] args) {
        wear(2400,2000); //체력 2400, 마력 2000
        wear(3800,1200); //체력 3800, 마력 1200
        wear(1999,2100);
        wear(2000,2000);

        System.out.println();
    }

    private static void wear(int hp, int mp) {
        if (hp >= 2000) {
            if (mp >= 2000) {
                System.out.println("아이템을 착용할 수 있습니다.");
            }
            else
                System.out.println("아이템을 착용할 수 없습니다.");

        }
        else
           System.out.println("아이템을 착용할 수 없습니다.");
        }
    }

