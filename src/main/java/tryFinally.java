



public class tryFinally {
    static String i = "";

    public static void main(String[] args) {
       // String a =finallyReturn();
       // System.out.println(a);

        int a = 1;
        int b = a;
        a = 3;
        System.out.println(b);


    }

    public static String finallyReturn() {
        String i = "0";
        try {
            i = "2";
            return i;
        } finally {
            i = null;
            System.out.println("i=" + i);
        }
    }
}
