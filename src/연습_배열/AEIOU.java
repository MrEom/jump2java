package 연습_배열;

public class AEIOU {
    public static void main(String[] args) {
        //변수 생성
        String s = "Programming is fun! right?";

        // 자음 모음 개수 세기
        int[] result = count(s);

        //결과 출력
        System.out.printf("%s\n => 자음 %d개, 모음 %d개", s, result[0], result[1]);

    }

    private static int[] count(String str) {
        int conso = 0; //자음
        int vowel = 0; //모음

        //문자열을 문자의 배열로 만듬
        //{'P','R','O','G','R','A','M','M','I','N','G',...,'?'}
        char[] characters = str.toUpperCase().toCharArray(); //대문자로 바꾸어서 배열

        //모든 문자 배열을 순회하며 검사
        for (int i = 0; i < characters.length; i++) {
            switch (characters[i]) {
                //모음
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel++;
                    break;


                // 공백 및 특수 문자 제외
                case ' ': // 스페이스
                case '\t': //탭
                case '\n': //엔터
                case ',': //콤마
                case '.': //닷
                case '?':
                case '!':
                    break;

                //그 외 (자음)
                default:
                    conso++;
                    break;

            }

        }
    return new int[]{conso, vowel};
    }
}
