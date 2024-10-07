package 연습_메소드;

public class Diet {
    public static void main(String[] args) {
        //변수 생성
        double w = 81.6;
        double t = 1.76;
        
        // BMI 계산
        double bmi = calculate(w,t);

        // 결과 출력
        System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
        System.out.printf("결과: %s입니다.\n",result(bmi));
    }



    private static double calculate(double weight, double tall) {
            return weight / (tall*tall);
    }


    private static String result(double calculate) {
        if (calculate >= 18.5 && calculate <= 22.9) {
            return "정상";
        }
        else if (calculate >= 23 && calculate <= 24.9) {
            return "비만전단계";
        }
        else if (calculate >= 25 && calculate <= 29.9) {
            return "1단계 비만";
        }
        else if (calculate >= 30  && calculate <= 34.9 ) {
            return "2단계비만";
        }
        else if (calculate >= 35) {
            return "3단계비만";
        }
        else
            return "저체중";
    }
}
