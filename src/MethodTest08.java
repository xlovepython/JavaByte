/*
计算n的阶乘
 */
public class MethodTest08 {
    public static void main(String[] args) {
        System.out.println(plus(5));
    }
    public static int plus(int n){
        int sum = 1;
        for(int i = n; i > 1; i--){
            sum *= i;
        }
        return sum;
    }
}
