class A {
    void show() {
        System.out.println("in A");
    }
}

class B extends A {
    void show() {
        System.out.println("in B");
    }
}

class C extends B {
    void show() {
        System.out.println("in C");

    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C(); // this is possible only for inehrited classes not for nrml classes
        obj.show(); // same object behaving different types
                    // but method callng is decided at run time
    }
}