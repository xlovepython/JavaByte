public class MethodTest02 {
    public static void main(String[] args) {
        int a = m();
        System.out.println(a);
    }
//    public static int m(){
//        boolean flag = true;
//        if(flag){
//            return 1;
//        }
//        return 0;
//    }
    public static int m(){
        boolean flag = true;
        return flag ? 1 : 0;
    }
}
