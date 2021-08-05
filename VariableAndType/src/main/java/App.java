public class App {
    static String global = "global variable";
    public static void main(String[] args){
//        String str;
//        str = "Day la lop Java";
        String str = "Day la lop Java";
        System.out.println(str);

        System.out.println(global);
        sum();
        final double PI = 3.14;
        System.out.println(PI);
        System.out.println("Name\tDOB");


        short s = 10; // -32768 -> 32767
        int i = 100; // -2^31 -> 2^31-1
        long l = 1000000000; // -2^63 -> 2^63-1
        long l2 = 100L;

        float f = 3.1f;
        double d = 5.7;
        char c = 'c';
        char c2 = '5';
        char c3 = 65;

        boolean b = true;
        boolean b2 = false;
    }

    private static void sum() {
        System.out.println(global);
    }
}
