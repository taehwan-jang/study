
public class Probability {
    public static void main(String[] args) {
        /*
         * 확률 지정을 위한 메소드 생성
         */
        double trueCount = 0;
        double falseCount = 0;
        int n = 0;
        // 표본 확보를 위해 횟수 100000회 지정
        while (n <= 100000) {
            n++;
            // 원하는 확률을 매개변수로 전달
            boolean flag = result(40);
            if (flag) {
                trueCount++;
            } else {
                falseCount++;
            }
        }
        System.out.println("성공횟수" + trueCount);
        System.out.println("실패횟수" + falseCount);
        // 실제 성공확률 계산
        double finalResult = trueCount / (trueCount + falseCount) * 100;
        System.out.println("성공확률" + finalResult + "%");
    }

    public static boolean result(double num) {
        // 확률 계산의 정확도 증가를 위해 랜덤 범위 지정
        int rand = (int) ((Math.random() * 1000000000) + 1);
        // 매개변수로 전달받은 num을 토대로 확률 지정
        if ((rand % 1000000000) <= num * 10000000) {
            return true;
        }
        return false;
    }
}
