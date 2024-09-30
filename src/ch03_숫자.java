public class ch03_숫자 {
    public static void main(String[] args) {
//       정수 타입(자료형)
        int age = 10;
        long count = 2183821823823813112L;
//      실수
        float pi = 3.14f;
        double pi2 = 3.141592653589793238;
//       8진수(8)와 16진수(0x)
        int oxtal = 023;
        int hex = 0xc3;
        System.out.println(oxtal);
        System.out.println(hex);
//      숫자 연산 (+ - * /) : 사칙연산
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(7%3);
        System.out.println(3%7);

//      증감연산 (++ , --) 1씩 증가 , 감소
        int i =0;
        int j = 10;
        i++; // i = i+1;
        j--; // j = j-1;
        System.out.println(i);
        System.out.println(j);

        System.out.println(++i);
        System.out.println(j--);
        System.out.println(j);

        int x = i++;
        int y = j + --j ;
        System.out.println(x);
        System.out.println(y);
        System.out.println(i);
        System.out.println(j);




    }
}
