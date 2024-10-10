package 연습_배열;

public class Bacteria {
    public static void main(String[] args) {
        // 배열 생성
        int[] bacteriaCountLogs = new int[10];

        //개체 수 기록
        writeLog(bacteriaCountLogs);

        //결과 출력
        printLog(bacteriaCountLogs);
    }



    //박테리아의 개체 수를 기록
    private static void writeLog(int[] logs) {
        int j = 1;
        for (int i = 0; i < logs.length; i++) {
            logs[i] = j;
            j=j*2;
        }

    }
    
    // 배열을 입력받아, 해당 요소를 모두 출력
    private static void printLog(int[] arr) {
        System.out.printf("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
            if (i != arr.length - 1) {
                System.out.printf(",");
            }
        }
        System.out.printf("]");
    }
}
