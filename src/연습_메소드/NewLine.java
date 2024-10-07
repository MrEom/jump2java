package 연습_메소드;

public class NewLine  {
    public static void main(String[] args) {
        System.out.println("라인 1");
        treeLines();
        System.out.println("라인 2");
    }
    public static void treeLines() {
        oneLine();
        oneLine();
        oneLine();
    }

    public static void oneLine() {
        System.out.println();// 한줄 뛰움
    }


}
