package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ch03_리스트 {
    public static void main(String[] args) {
        //필요한 자료형 타입
        ArrayList pitches = new ArrayList(); //어레이리스트 객체 생성
        //아이템을 추가할때는 add 메서드
        pitches.add("138"); //첫번째 입력 아이템 (.)
        pitches.add("129"); // 두번째 (1)
        pitches.add("142"); // 세번째 (2)
        //아이템에 접근(가져오기)
        System.out.println(pitches.get(1));

        //사이즈(크기) 몇개냐? (배열은 .length)
        System.out.println(pitches.size());

        //contains : 아이템이 있으면 참 없으면 거짓
        System.out.println(pitches.contains("142"));

        //remove : 삭제하기 (아이템 or 인덱스)
        System.out.println(pitches.remove("129"));
        System.out.println(pitches.remove(0));

        //제네릭 : 자료형을 안전하게 사용 할 수있도록 미리 타입을 정함
        ArrayList<String> pitches1 = new ArrayList<>();
        pitches1.add("138");
        pitches1.add("129");

        String one = pitches1.get(0);
        String two = pitches1.get(1);

        System.out.println(pitches1);

        // 정수형 리스트를 만들어 보자
        ArrayList<Double> numbers = new ArrayList();
        numbers.add(1.1);
        numbers.add(2.1);
        numbers.add(3.3);
        numbers.add(4.4);

        System.out.println(numbers);

        // 배열을 리스트로 변환하기
        String[] data = {"월", "화", "수"};
        //Arrays 의 asList(배열) 로 변환
        ArrayList<String> weeks = new ArrayList(Arrays.asList(data));
        weeks.add("목");
        weeks.add("금");
        System.out.println(weeks);

        //아이템을 직접 입력하기
        ArrayList<String> n = new ArrayList(Arrays.asList(1,2,3));
        System.out.println(n);

        //아이템들을 문자열로 String.jo 합치기
        String result = String.join(" : ", weeks);
        System.out.println(result);

        //리스트 정렬하기
        n.sort(Comparator.reverseOrder()); //역순 정렬 (내림차순)
        System.out.println(n);

        // 정방향으로 정렬
        weeks.sort(Comparator.naturalOrder()); // 정방향 (오름차순)
        System.out.println(weeks); //한글은 가나다라마바사

        

    }
}
