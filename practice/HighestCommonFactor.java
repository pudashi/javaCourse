package practice;

public class HighestCommonFactor {

    public static void main(String[] args) {
        int b = 525;
        int a = 231;
        System.out.println(callMaxCommon(a, b));
    }
    public static int callMaxCommon(int a, int b) {
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        return maxCommon(a, b);

    }

    public static int maxCommon(int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        } else {
            return maxCommon(b, r);
        }
    }
}
