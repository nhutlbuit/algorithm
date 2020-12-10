public class interfaceJava8 {

    interface Interface1{
        default void doSomething(){
            System.out.println("Do interface1");
        }
    }

    interface Interface2{
        default void doSomething(){
            System.out.println("Do interface2");
        }

        static void stFunction(){}

    }

    public static class MutilInherit implements Interface1, Interface2 {

        @Override
        public void doSomething() {
            Interface1.super.doSomething();
            Interface2.super.doSomething();
        }
    }

    public static void main(String[] args) {
        MutilInherit mutilInherit = new MutilInherit();
        mutilInherit.doSomething();
    }

}
