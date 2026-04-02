class Demo {

    void A() throws ClassNotFoundException {

        Class.forName("calc");

    }

    void B() throws Exception {

        A();
    }

    void C() {

        try {
            B();
            A();
        } catch (Exception e) {
            System.out.print(e);
        }

    }

}

public class DockingExceptionUsingThrows {
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.C();

    }
}
