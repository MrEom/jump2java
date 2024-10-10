package 연습_상속인터페이스;

import java.util.ArrayList;

public class InterfaceReview {
    public static void main(String[] args) {
        //객체생성
        Sounding dog = new dog();
        Sounding baby = new baby();
        Sounding tiger = new tiger();
        Sounding robot = new robot();

        //ArrayList를 통한 객체 저장
        ArrayList<Sounding> list = new ArrayList<Sounding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);
        
        //각각 소리내기
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sound();
        }

        for (Sounding s : list) {
            s.sound();

        }
    }
}

interface Sounding{
    void sound();
}

class dog implements Sounding{
    public void sound(){
        System.out.println("dog : 멍멍!");
    }
}

class baby implements Sounding{
    public void sound(){
        System.out.println("baby : 응애~");
    }
}

class tiger implements Sounding{
    public void sound(){
        System.out.println("tiger : 어흥");
    }
}

class robot implements Sounding{
    public void sound(){
        System.out.println("robot : 삐비비빅");
    }
}

