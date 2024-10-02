package ch03;

public class Ch03_StringBuffer {
    public static void main(String[] args) {
        //문자열을 추가하거나 변경할때 사용하는 자료형
        StringBuffer sb = new StringBuffer(); //StringBuffer 객체 sb 생성
        //버퍼 객체는 append 메소드를 사용해서 문자열을 추가한다.
        sb.append("Hello");
        sb.append(" ");
        sb.append("점프 to 자바");
        String result2 = sb.toString();
        System.out.println(result2);

        //sb 대신 문자열로 해보자
        String result = "";
        result += "헬로우";
        result += " ";
        result += "점프 to 자바";
        System.out.println(result);

        //insert 특정 위치에 문자열을 삽입
        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0,"hello "); // 0번째 인덱스에 추가
        System.out.println(sb2.toString());

        // substring 문자열 잘라내기
        StringBuffer sb3 = new StringBuffer();
        sb3.append("hello jump to java");
        System.out.println(sb3.substring(0,4));

    }
}

