package 연습_배열;

public class Local {
    public static void main(String[] args) {
        //배열 생성
        String[] cities = {"서울", "부산", "인천", "대전", "대구"};
        int[] visits = {599, 51, 46, 43, 27};

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%s : %s 명\n", cities[i], visits[i]);
        }

    }
}
