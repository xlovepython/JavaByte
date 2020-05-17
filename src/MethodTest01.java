public class MethodTest01 {
    public static int plus(int x, int y) {
        return x * y;
    }
    public static void main(String[] args) {

        int c = divide(10,2);
        System.out.println(c);
        System.out.println(add(1,4));
        System.out.println(MethodTest01.plus(7,9));
        System.out.println(MyClass.add(1,4));

    }
    public static int divide(int x, int y){
        x = plus(x, y);
        return x / y;

    }
    public static int add(int x, int y){
        return x + y;
    }
}


class MyClass{
    public static int add(int x, int y) {
        return x + y + 1;
    }
}